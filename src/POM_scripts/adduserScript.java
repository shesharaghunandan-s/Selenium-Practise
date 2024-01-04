package POM_scripts;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_pages.actitimeEnterTimetrack;
import POM_pages.actitimeLogin_page;
import POM_pages.actitimeUserList_page;
import POM_pages.addUser_page;
/*program for adding new user*/
public class adduserScript {
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
		actitimeLogin_page ob1=new actitimeLogin_page(driver);
		/*enters the username*/
		ob1.tbUsername.sendKeys("admin");		
		/*enters the password*/
		ob1.tbPassword.sendKeys("manager");
		/*clicks on login*/
		ob1.btnLogin.click();
		/*create an object of actitimeEnterTimetrack page class*/
		actitimeEnterTimetrack ob2 = new actitimeEnterTimetrack(driver);
		/*click users*/
		ob2.lnkUsers.click();
		/*create an object of user page class*/
		actitimeUserList_page ob3 = new actitimeUserList_page(driver);
		/*click on new user button*/
		ob3.btnNewUser.click();
		/*create an object of add user page class*/
		addUser_page ob4 = new addUser_page(driver);
		Thread.sleep(2000);
		/*identifies firstname textfiels and enters the value*/
		ob4.tbFirstName.sendKeys("shesha");
		/*identifies lastname textfiels and enters the value*/
		ob4.tbLastName.sendKeys("raghunandan");
		/*identifies the email textbox and enters the value*/
		ob4.tbEmail.sendKeys("abc@gmail.com");
		/*click on save button*/
		ob4.btnSave.click();
}
}
