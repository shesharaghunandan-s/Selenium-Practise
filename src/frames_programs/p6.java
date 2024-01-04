package frames_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*clearing the data in textbox in different frames using de*/
public class p6 {
public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		 WebDriver driver = new ChromeDriver();
		
		/* maximize the windows*/
		driver.manage().window().maximize();
		
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium%20html/page2.html");
		/* identify and enter the data into textbox t2*/
		driver.findElement(By.id("t2")).sendKeys("selenium");
		/*switch the control to the frame whose id='i1'*/
		driver.switchTo().frame("f1");//thirs method of frame
		/* identify and enter the data into textbox t1*/
		driver.findElement(By.id("t1")).sendKeys("java");
		/*pause the program for 3 sec*/
		Thread.sleep(3000);
		/*identify and clear the data in textbox t1*/
		driver.findElement(By.id("t1")).clear();
		/*switch the control to main frame*/
		driver.switchTo().defaultContent();
		/*identify and clear the data in textbox t2*/
		driver.findElement(By.id("t2")).clear();
	
}
}
