package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*program for scrolling*/
public class P5 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.actitime.com/");
		Thread.sleep(5000);
		/*to find the element*/
		WebElement element = driver.findElement(By.xpath("//div[text()='Start with actiTIME for free']"));
		/*create object of action class*/
		Actions a=new Actions(driver);
		/*scroll down to specified element*/
		a.scrollToElement(element).perform();
		
}
}
