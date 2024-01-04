package testNG_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/*program for validation using assert class*/
public class P14 {

	
	@Test
	public void actiLoginScript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 /*validate whether browser has been launched successfully*/
		 Set<String> windows = driver.getWindowHandles();//1.driver.getWindowHandles() this method will return all the windows opened in gorm of selenium address
		                                                 //windows.size() gives number of address
		                                                 //if size() is one it means only one window has been opened
		 Assert.assertEquals(windows.size(),1);
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		/*validate whether login page is loaded*/
		WebElement loginPageText = driver.findElement(By.id("headerContainer"));
		Assert.assertEquals(loginPageText.isDisplayed(), true);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	    driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	
		Thread.sleep(3000);

	String  expectedLandingPageTitle="actiTIME - Enter Time-Trac";
	String actualLandingPageTitle=driver.getTitle();

	String  expectedLandingUrl="https://demo.actitime.com/user/submit_tt.do";
	String actualLandingPageUrl=driver.getCurrentUrl();
	
	/*validates whether login has happened*/
	Assert.assertEquals(actualLandingPageTitle, expectedLandingPageTitle);//Assert class of TessNG should be selected
    Assert.assertEquals(actualLandingPageUrl, expectedLandingUrl);
}
}