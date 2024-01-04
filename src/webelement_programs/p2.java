package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for send keys()*/
public class p2 {
public static void main(String[] args) {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium%20html/selenium2.html");

		
		/*identify the webelement with id=i1*/
	 WebElement textbox = driver.findElement(By.id("i1"));
	 
	 
	   /*enter the data into textbox*/
	 textbox.sendKeys("selenium");
}
}