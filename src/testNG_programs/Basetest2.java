package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basetest2 {
	 ChromeDriver driver; //(this has to be made non static variable as it is used by all methods)
		
		@BeforeClass
		public void precondition()
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
		}
		@AfterClass
		public void postcondition(){
			driver.quit();
		}
}
