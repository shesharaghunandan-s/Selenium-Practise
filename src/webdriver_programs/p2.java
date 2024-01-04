package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;
/* program for getTitle(),getCurrentUrl() and getPageSource() */

public class p2 {
	public static void main(String[] args) {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		ChromeDriver driver = new ChromeDriver();
		
		
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.amazon.com");
		
		
		/*retrive the title of the current webpage*/
		String loginPageTitle =driver.getTitle();
		System.out.println( loginPageTitle);
		
		
		/*retrive the url of the current webpage*/
		String  loginpageurl =driver.getCurrentUrl();
		System.out.println(loginpageurl );
		
		
		/* retrive the source code of current webpage*/
		String loginPageSourceCode=driver.getPageSource();
		System.out.println(loginPageSourceCode);
		driver.close();
	}
}
