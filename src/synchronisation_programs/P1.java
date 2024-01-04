package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for implicitly wait*/
public class P1 {
public static void main(String[] args) {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		/*defines implicitly wait of 30 sec*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//difference between 'thread.sleep()'and this method is the in thread.sleep method 
		                                                                  //click action ao element is fetched only after complete time is over but in this method 
		                                                                //once the page is loaded suddenly element is fetched or clicked withoud waiting to complete 
		                                                                //time to over.in projects we use this method to save time and not 'thread.sleep method'
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/* identifies the username and enters the data*/
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		/*identifies the password and enters the data*/
	   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		/*identifies the login button and click on it*/
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();	
		/*identifies the user button and clicks*/
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		
		}
}
