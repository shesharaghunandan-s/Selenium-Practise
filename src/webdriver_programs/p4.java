package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
public static void main(String[] args) {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.facebook.com");
		
		/*navigate to specified url*/
		driver.navigate().to("https://amazon.com");
		
		/*navigate backwards*/
		driver.navigate().back();
		
		/*navigate forward*/
		driver.navigate().forward();
		
		/*refresh the web page*/
		driver.navigate().refresh();
		
}
}
