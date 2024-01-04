package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/* finding elements using xpath*/
public class actilogin3 {

public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		
		/* maximize the windows*/
		driver.manage().window().maximize();
		
		
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		
		
		/* identifies the username and enters the data*/
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		
		/*identifies the password and enters the data*/
	   driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		
		/*identifies the login button and click on it*/
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			
		}
     
}