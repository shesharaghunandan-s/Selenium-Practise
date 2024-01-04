package popup_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*program for javascript popup (confirmation popup)*/
public class P2 {
public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		/*defines implicitly wait of 30 sec*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium%20html/alert.html");
		/*identifies and click on try it button*/
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		/*create an object of webdriverwait*/
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		/*wait until javascript popup is loaded*/
		wait.until(ExpectedConditions.alertIsPresent());
		/*switches the control to the js popup*/
		Alert a = driver.switchTo().alert();
		/*click on ok button*/
		a.accept();
}
}