package frames_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
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
		
	    /*identify the frame */
		WebElement page1_frame = driver.findElement(By.id("f1"));//frames will have tagname as 'iframe' and after we can attributes of it like id=f1
		
		/*switch the control to specifies frame*/
		driver.switchTo().frame(page1_frame);
		
		/* identify and enter the data into textbox t1*/
		driver.findElement(By.id("t1")).sendKeys("java");		
}
}
