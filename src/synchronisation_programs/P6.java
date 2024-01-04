package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
/*program for fluent wait*/
public class P6 {
public static void main(String[] args) {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		/*defines implicitly wait of 30 sec*/
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
		/*create the object of fluent wait*/
		FluentWait wait=new FluentWait(driver);
		/*specifies polling period*/
		wait.pollingEvery(Duration.ofMillis(250));
		/*specifies time out period*/
		wait.withTimeout(Duration.ofSeconds(30));
		/*ignores the exception */
		wait.ignoring(NoSuchElementException.class);
		/*wait until user button is visible*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='content users']")));
		/*identifies the user button and clicks*/
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		
		}
}
