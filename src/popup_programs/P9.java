package popup_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		/*defines implicitly wait of 30 sec*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.foundit.in/");
		/*identify and click on register button*/
		driver.findElement(By.xpath("//div[contains(text(), 'Upload Resume')]/parent::div")).click();
		/*identifies and click on upload resume button*/
		driver.findElement(By.xpath("//button[text()='Or select file to upload']/parent::div")).click();
		Thread.sleep(2000);
		/*upload the file*/
		P8.fileUpload("D:\\SELENIUM WORKSPACE\\Selenium_workspace\\upload\\shesharesume.docx");
		
}
}
