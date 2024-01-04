package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;
/* program for get() and close() */
public class p1 {
	public static void main(String[] args) {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.amazon.com");
		/* closes the browser*/
		driver.close();
	}

}
