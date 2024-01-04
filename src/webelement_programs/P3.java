package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
public static void main(String[] args) {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium3.html");
		
		
		/* maximize the windows*/
		driver.manage().window().maximize();
		
		/*finding the element and entering the inpt*/
		driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("java");//1.cssselector is used when we have same tag,id,name and other attributes for two elements in a page
		                                                                           //2.since as both elements have same value for attributes we cannot differentiate between them and if 
		                                                                           //       if we use 6 locators then every time only one element will be accessable 
		                                                                           //3.hence we go for cssselector here we first press 'control+F' to open a seach tab
		                                                                           //      in search tab we use css syntax tagname[attribute='value'] example input[tabindex='1']
		
		
		/*finding the element and entering the inpt*/
		driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("selenium");
		
		

}
}