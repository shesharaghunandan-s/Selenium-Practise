package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*drag and drop operation using action class*/
public class P2 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		/*identifies block1*/
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		/*identifies block4*/
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		/*create objext of action class*/
		Actions a=new Actions(driver);
		/*perform drag and drop operetion*/
		a.dragAndDrop(block1, block4).perform();;
}
}