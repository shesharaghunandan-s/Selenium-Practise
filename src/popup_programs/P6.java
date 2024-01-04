package popup_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for child browser popup*/
public class P6 {
public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		 WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		/*identifies the follow all button and click on it*/
		driver.findElement(By.id("followall")).click();
		Thread.sleep(5000);
		multiplewindows(driver);
		System.out.println(driver.getTitle());
      }
    /*method to close all the child windows*/
		public static void multiplewindows(WebDriver driver) throws InterruptedException {	
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
			 //String title=driver.getTitle();
			 
			 /*closes the window whose title contains facebook*/
			 if(!mainwindow.equals(lv))//"!"(not operator will revert the boolean value returned by "lv.equals(mainwindow)".so 'true' value will be changed to 'false'
		     {
				 /*closes the window where the control is*/
				 driver.close();
			 }
			
			 /*pause for some seconds to see the execution*/
			 Thread.sleep(1000);
		 }
		 /* switches the control to the main window*/
		driver.switchTo().window(mainwindow) ;//inorder to move control from child window to main window back this is used if this is not done means there will be
		                                      // problem in getting page title or pageURL etc as control still be in deleted child page and unable to find title or url
		 
}
}
