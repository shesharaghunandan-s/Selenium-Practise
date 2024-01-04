package autoSuggestion_progarm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
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
			 System.out.println(text);
		 }
}
}