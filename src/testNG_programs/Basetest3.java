package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
/*program for parallel execution*/ //(for parallel exection we need to add parallel="test" in  "<suite name="Suite" parallel="tests">  .xml file)
public class Basetest3 {
   WebDriver driver;
	@Parameters("BrowserName")
	@BeforeMethod
	public void launchBrowser(String bn)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		if(bn.equals("chrome"))
		 driver = new ChromeDriver();
		else if(bn.equals("firefox"))
		 driver=new FirefoxDriver();
		else if(bn.equals("edge")) 
		 driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	@Parameters("BrowserName")
	@BeforeTest
	public void beforetest(String bn)
	{
		System.out.println(bn+" test started the execution");
	}
	
	@Parameters("BrowserName")
	@AfterTest
	public void aftertest(String bn)
	{
		System.out.println(bn+" test completed the execution");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("suite started the execution");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("suite completed the execution");
	}
}