package autoSuggestion_progarm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM WORKSPACE\\Selenium_workspace\\drivers\\chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.google.co.in");
		/*identify and enter the data into textbox*/
		driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		/*pause the program for 1 sec*/
		Thread.sleep(2000);
		/*identifies autosuggestions*/
     	 List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		 /*retrive the text from autosuggestion and print*/
		 for(WebElement lv:autoSuggestions)
		 {
			 String text = lv.getText();
			 if(text.equals("selenium python"))
					 {
				 lv.click();
				 break;//if break statement not used means stale exception appears in this case after finding 'text=selenium download' lv.click operates and 
				       //selenium download page will open.but for loop cotinues and lv.get text try to get the text of the next suggestion that has appeared when
				       // we  had searched 'selenium' but it is not possible to get text and already 'selenium donload' suggestion has been clicked and new page opened
					 }
		 }
		 
}
}