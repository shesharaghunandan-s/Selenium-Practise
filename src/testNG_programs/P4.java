package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P4 {

	ChromeDriver driver; //(this has to be made non static variable as it is used by all methods)
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	@Test
	public void actiLoginScript()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	}
	
	@Test
	public void fbLoginScript()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shesha");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
	}
}
