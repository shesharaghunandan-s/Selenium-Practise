package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*program for explicit wait using titlecontains method*/
public class P3 {
public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/*retrive the title of login page*/
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		/* identifies the username and enters the data*/
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		/*identifies the password and enters the data*/
	   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		/*identifies the login button and click on it*/
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();	
		/*create an object of WebDriverWait*/
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		/*waits until the title of webpage is expectedLandingPageTitle*/
		wait.until(ExpectedConditions.titleContains("Enter"));			
		/*retrive the title of landing page*/
		String landingPageTitle = driver.getTitle();
		System.out.println(landingPageTitle);
		}
}
