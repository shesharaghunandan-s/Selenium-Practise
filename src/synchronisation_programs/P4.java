package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*program for explicit wait*/
public class P4 {
public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		/*creates the object of WebDriverWait*/
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/* identifies the username and enters the data*/
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		/*identifies the password and enters the data*/
	   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		/*identifies the login button and click on it*/
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();	
		/*wait until login button is invisible*/
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("a[id='loginButton']")));
		/*wait until user button is visible*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='content users']")));
		/*identifies the user button and clicks*/
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		
}
}
