package testNG_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/*validation using softassert class*/
public class P16 {
	@Test
	public void actiLoginScript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 /*validate whether browser has been launched successfully*/
		 Set<String> windows = driver.getWindowHandles();
		 
		 SoftAssert s=new SoftAssert();//we are creating object of softassert class because most of method in it are non static methods
		 s.assertEquals(windows.size(),0);//softassert class have method by same name as that of assert class
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		/*validate whether login page is loaded*/
		WebElement loginPageText = driver.findElement(By.id("headerContainer"));
		s.assertEquals(loginPageText.isDisplayed(), true);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	    driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	
		Thread.sleep(3000);

	String  expectedLandingPageTitle="actiTIME - Enter Time-Trac";
	String actualLandingPageTitle=driver.getTitle();

	String  expectedLandingUrl="https://demo.actitime.com/user/submit_tt.do";
	String actualLandingPageUrl=driver.getCurrentUrl();
	
	/*validates whether login has happened*/
	s.assertEquals(actualLandingPageTitle, expectedLandingPageTitle);//Assert class of TessNG should be selected
    s.assertEquals(actualLandingPageUrl, expectedLandingUrl);
    s.assertAll();//if this statement is not written means test is shown as pass if this statement is written the it show which all step got failed
}
}
