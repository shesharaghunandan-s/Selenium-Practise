package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*progam using isDisplay() to chech whether text is present in the page*/
public class P7 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/*to find element*/
		WebElement text = driver.findElement(By.id("headerContainer"));
		/*check whether the text is displayed*/
		System.out.println(text.isDisplayed());
		/*validate whether login page is loaded properly*/
		if(text.isDisplayed()) {
			System.out.println("login page has loaded properly");
		}
		else
		{
			System.out.println("login page has not been loaded properly");
		}
}
}