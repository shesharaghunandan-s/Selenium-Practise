package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
public static void main(String[] args) {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.facebook.com");
		
		/* maximizes the browser*/
		driver.manage().window().maximize();
		
		/* full screens the browser*/
		driver.manage().window().fullscreen();
		
		/* minimize the browser*/
		driver.manage().window().minimize();
}
}
