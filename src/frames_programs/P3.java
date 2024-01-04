package frames_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*switching the control to the frame using name*/
public class P3 {

public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		 WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/page2.html");
		/* identify and enter the data into textbox t2*/
		driver.findElement(By.id("t2")).sendKeys("selenium");
		/*switch the control to the frame whose name='i1'*/
		driver.switchTo().frame("n1");//second method of frame
		/* identify and enter the data into textbox t1*/
		driver.findElement(By.id("t1")).sendKeys("java");
}
}
