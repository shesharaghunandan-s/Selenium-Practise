package actions_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*program for right click*/
public class P4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/*identifies the link*/
		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		/*create object of action class*/
		Actions a=new Actions(driver);
		/*right click on the link*/
		a.contextClick(link).perform();
		/*create object of robot class*/
		Robot R=new Robot();
		/*to select the ingognito tab from right clicked link*/
		R.keyPress(KeyEvent.VK_W);//w=new window. t=new tab. g=new incognito window
		/*releasing */
		R.keyRelease(KeyEvent.VK_W);
		
}
}