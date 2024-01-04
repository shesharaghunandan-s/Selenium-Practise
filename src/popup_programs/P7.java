package popup_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*program for handling geolocation popup and notification*/
public class P7 {
public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/*create an object of chromeoptions class*/
		ChromeOptions options=new ChromeOptions();//here for handling notifications we directly go to setting of the browser and make changes 
		/*disable notification*/
	options.addArguments("--disable-notifications");
	/*disable geolocation*/
	options.addArguments("--disable-geolocation");//use menthod addargument(string)
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver(options);
		/*defines implicitly wait of 30 sec*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.hdfcbank.com/");
		
}
}
