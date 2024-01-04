package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeLogin_page;
/*script for login page using elements fromavtitimeLogin class*/
public class loginscript {
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
		actitimeLogin_page ob1=new actitimeLogin_page(driver);//whatever content driver variable has in this class will be
		                                                      //reflected in "public actitimeLogin_page(WebDriver driver)" of 'actitimeloginpage' classs
		/*enters the username*/
		ob1.tbUsername.sendKeys("admin");		
		/*enters the password*/
		ob1.tbPassword.sendKeys("manager");
		/*clicks on login*/
		ob1.btnLogin.click();
}
}
