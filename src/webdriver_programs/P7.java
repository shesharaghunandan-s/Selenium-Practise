package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/* closing only one particular child window*/
public class P7 {
public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		/* maximize the windows*/
		driver.manage().window().maximize();
		
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		
		/*identifies the follow all button and click on it*/
		driver.findElement(By.id("followall")).click();
		
		Thread.sleep(5000);
		
		/*return the unique reference of the main window*/
		 String mainwindow = driver.getWindowHandle();
		
		 
		 /*return the unique reference of all the windows including main*/
		 Set<String> allwindows = driver.getWindowHandles();
		 
		 /*iterates the step*/
		 for(  String lv :allwindows)
		 {
			 /*switches the control to specifies windoww*/
			 driver.switchTo().window(lv);
			 
			 /*retrive the title of the window*/
			 String title=driver.getTitle();
			 
			 /*closes the window whose title contains facebook*/
			 if(title.contains("Facebook"))//we have to inspect the page which has to be closed and find out title of page like we did here i.e "Facebook"
				                           //"Facebook" is compared with title that we obtained with getTitle method
					 {
				 /*closes the window where the control is*/
				 driver.close();
			 }
			
			 /*pause for some seconds to see the execution*/
			 Thread.sleep(1000);
		 }
		 
}
}
