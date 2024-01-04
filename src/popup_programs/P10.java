package popup_programs;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for file upload or system popup using autoit*/
public class P10 {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
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
		/*execute the exe file*/
		Runtime.getRuntime().exec("D:\\SELENIUM WORKSPACE\\Selenium_workspace\\upload\\FUpopup.exe");//use Runtime class of java.lamg package
		
}
}
