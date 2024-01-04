package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* program for getwindowHandle() and getWindowsHandles() method*/
public class p5 {
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
		
		/*return the unique reference of the main window*/
		 String mainwindow = driver.getWindowHandle();
		 System.out.println(mainwindow);
		 
		 /*return the unique reference of all the windows including main*/
		 Set<String> allwindows = driver.getWindowHandles();//it returns a collection of string(each string is a address of webpage opened and address is selenium generated address)
		                                                    // the returned address will be stores as set collection
		 System.out.println(allwindows);
		 System.out.println("-------------------------------");
		 
		 /*iterates the step*/
		 for(  String lv :allwindows)
		 {
			 System.out.println(lv);
		 }
		           
}
}