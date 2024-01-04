package POM_scripts;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_pages.actitimeEnterTimetrack2;
import POM_pages.actitimeLogin_page2;
import POM_pages.actitimeUserList_page2;
import POM_pages.addUser_page2;
/*program for adding new user*/
public class adduserScript2 {
public static void main(String[] args) throws InterruptedException {
		
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
		actitimeLogin_page2 ob1 = new actitimeLogin_page2(driver);
		/*to login*/
		ob1.login("admin", "manager");
		/*creates object ofactitimeEnterTimetrack2*/
		 actitimeEnterTimetrack2 ob4 = new actitimeEnterTimetrack2(driver);
		 /*to click on users button*/
		ob4.clickUsers();
		/*creates object ofactitimeUserList_page2*/
		actitimeUserList_page2 ob2 = new actitimeUserList_page2(driver);
		/*to click on newuser button*/
		ob2.clickNewUser();
		Thread.sleep(2000);
		/*creates object ofaddUser_page2*/
		addUser_page2 ob3 = new addUser_page2(driver);
		/*to add newuse*/
	    ob3.addUsers("shesha", "raghunandan", "sr.nandan96@gmail.com");
		
}
}
