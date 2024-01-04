package popup_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*program for javascript popup (confirmation popup)*/
public class P1 {
public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		/*defines implicitly wait of 30 sec*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
		/*identifies the user button and clicks*/
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		/* identify the new user button and click */
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(2000);
		/* identifies the first name and enter the data*/
		driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("shesha raghunandan");
		/*identifies the close button and click on it*/
		driver.findElement(By.xpath("//div[contains(@class,'closeButton hide')]")).click();
		/*create an object of webdriverwait*/
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		/*wait until javascript popup is loaded*/
		wait.until(ExpectedConditions.alertIsPresent());
		/*switches the control to the js popup*/
		Alert a = driver.switchTo().alert();
		/*retyrive the text from JS popup*/
		String text = a.getText();
		System.out.println(text);
		/*click on ok button*/
	    a.accept();
		/*click on cancel button*/
		//a.dismiss();
		
		}
}
