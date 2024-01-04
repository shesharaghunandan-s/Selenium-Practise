package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimetrack;
import POM_pages.actitimeEnterTimetrack2;
import POM_pages.actitimeLogin_page;
import POM_pages.actitimeLogin_page2;
/*program for logout*/
public class logoutScript2 {
public static void main(String[] args) {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/*defines implicitly wait of 30 sec*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/*creates an object of actitimelogin_page*/
		/*creates an object of actitimelogin_page*/
		actitimeLogin_page2 ob1 = new actitimeLogin_page2(driver);
		/*to login*/
		ob1.login("admin", "manager");
		/*create the object of actitimeEnterTimetrack2 page*/
		actitimeEnterTimetrack2 ob2 = new actitimeEnterTimetrack2(driver);
		/*click on logout*/
		ob2.clickLogout();
}
}