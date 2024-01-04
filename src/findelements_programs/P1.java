package findelements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*program to getText()*/
public class P1 {
	public static void main(String[] args) throws InterruptedException {
	/* sets the path for chromedriver.exe*/
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	
	/* launch the chrome browser */
	WebDriver driver = new ChromeDriver();
	
	
	/* maximize the windows*/
	driver.manage().window().maximize();
	
	/* search the web app and waits until it is loaded completly */
	driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium1.html");
	/*identify the web element with id=i1*/
	     WebElement link = driver.findElement(By.id("i1"));//driver.findElement(By.id("i1")) this statement will give object of RemoteWebElement class and it will be 
	                                                       //upcasted to webelement interface according to convention
	     System.out.println(driver.findElement(By.id("i1")));//from this statement we can know that "driver.findElement(By.id("i1"))" will give object of RemoteWebElement
	    System.out.println(link.getClass().getName());//from this statement we can know that object  of RemoteWebElement class is created and upcasted to webelement interface
	     /*Retrieve the text of web element*/
	     String text = link.getText();//gettext method will give whatever text present in the html code of the selected element
	     System.out.println(text);
	}

}
