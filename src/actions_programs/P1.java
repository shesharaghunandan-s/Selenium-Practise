package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*program for mouseover operation*/
public class P1 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.vtiger.com/");
		/*identify resource*/
		WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		/*create an object of action class*/
		Actions a=new Actions(driver);
		/*perform mouseover operation*/
		a.moveToElement(resources).perform();
}
}
