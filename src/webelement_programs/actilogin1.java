package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class actilogin1 {

public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		
		
		/* variable with expected login page title */
		String  expectedLoginPageTitle="actiTIME - Login";//to get title 1.click right mouse button	
		                                                   //            2.select inspect
		                                                  //             3.click on <head> in html code and then copy and paste text written next to<title>
	   /* retrive the actual title of login page */
		String actualLoginPageTitle=driver.getTitle();	
		
		/*validating whether login page is loaded*/
		
		if(expectedLoginPageTitle.equals(actualLoginPageTitle))
		{
		System.out.println("login page is loaded");
		}
		else
		{
			System.out.println("unable to load login page");
		}	
		
		/* identifies the username and enters the data*/
		driver.findElement(By.id("username")).sendKeys("admin");
		
		
		/*identifies the password and enters the data*/
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		/*identifies the login button and click on it*/
		driver.findElement(By.id("loginButtonContainer")).click();
		
		Thread.sleep(5000);//if this statement is not written means statment below will execute even before landing page is loaded "else if" condition is checked which result in failing test case
		
		
		/* variable with expected landing page title */
		String  expectedLandingPageTitle="actiTIME - Enter Time-Track";
		
		 /* retrive the actual landing page title */
		String actualLandingPageTitle=driver.getTitle();
		
		/* variable with expected landing page URL*/
		String  expectedLandingUrl="https://demo.actitime.com/user/submit_tt.do";
		
		 /* retrive the actual landing page URL */
		String actualLandingPageUrl=driver.getCurrentUrl();
		
		if(expectedLandingPageTitle.equals(actualLandingPageTitle) && expectedLandingUrl.equals(actualLandingPageUrl))
		{
			System.out.println("login is successful and landing page is loaded");
		}
		else
		{
			System.out.println("login is not successful and unable to load landing page");
		}
			
		driver.close();	
		}
     
}