package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest1 {
   ChromeDriver driver; //(this has to be made non static variable as it is used by all methods)
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
}
