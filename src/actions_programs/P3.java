package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*double click operation*///(we have copied and pasted double click html code by searching)
public class P3 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium%20html/doubleclick.html");
		/*identify the webelement*/
		WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
		/*create object of action class*/
		Actions a=new Actions(driver);
		/*perform double click operation*/
		a.doubleClick(text).perform();
}
}
