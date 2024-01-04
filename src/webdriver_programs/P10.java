package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*handling the tabs*/
public class P10 {
	
	public static void main(String[] args) throws InterruptedException {
	
	/* sets the path for chromedriver.exe*/
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	
	/* launch the chrome browser */
	 WebDriver driver = new ChromeDriver();
	
	/* maximize the windows*/
	driver.manage().window().maximize();
	
	/* search the web app and waits until it is loaded completly */
	driver.get("https://demo.actitime.com/login.do");
	
	
	/*identifies the link button and click on it*/
	driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
	 Thread.sleep(5000);
	multipleTabs(driver);
}
	
	public static void multipleTabs(WebDriver driver) throws InterruptedException {
		/*return the unique reference of the main window*/
				 String oldtab = driver.getWindowHandle();//when getwindow handle is used it will give us the old tab reference and not the new tab that we have opened
		                                                  //by clicking link
		 /*return the unique reference of all the windows including main*/
		 Set<String> alltabs = driver.getWindowHandles();
		
		 for(String lv :alltabs)
		 {
			 /*switches the control to specifies windoww*/
			 driver.switchTo().window(lv);

			 
			 /*closes the old tab*/
			 if(lv.equals(oldtab))
		     {
				 /*closes the window where the control is*/
				 driver.close();
			 }
			
			 /*pause for some seconds to see the execution*/
			 Thread.sleep(1000);
		 }
}
}