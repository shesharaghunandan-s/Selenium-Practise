package popup_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*program for file upload or system popup*/
public class P8 {
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
		driver.get("https://www.naukri.com/");
		/*identify and click on register button*/
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		/*identifies and click on upload resume button*/
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(2000);
		fileUpload("D:\\SELENIUM WORKSPACE\\Selenium_workspace\\upload\\shesharesume.docx");
}
/*method for file upload*/
public static void fileUpload(String fileLocation) throws AWTException
{
	StringSelection s=new StringSelection(fileLocation);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//StringSelection s=new StringSelection(fileLocation);
	                                                                      //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null).this two statements
	                                                                     //will copy the location of document to clipboard and when ctrl+v is pressed document location 
	                                                                     // will be uploaded in search box of popup
	/*create an object of robot class*/
	Robot R=new Robot();
	/*press control+v*/
	R.keyPress(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_V);
	/*release contol+v*/
	R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyRelease(KeyEvent.VK_V);
	/*press enter*/
	R.keyPress(KeyEvent.VK_ENTER);
	/*release enter*/
	R.keyRelease(KeyEvent.VK_ENTER);
}
}
