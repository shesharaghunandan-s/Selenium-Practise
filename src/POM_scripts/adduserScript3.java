package POM_scripts;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_pages.initialisePages;
/*program for adding new user*/
public class adduserScript3 {
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
		/*create the object of initialisePage*/
		initialisePages pages = new initialisePages(driver);//in previous program we used to create abject for each class to accesses their members now by 
		                                                    //  using concept of "composition" we store address of all object inside another object.once object
		                                                    //of initialisePages is created object of other 4 classes is also created and their address is store in
		                                                   // variable(e.g:actitimeEnterTimetrack).using this variable nonstatic members of that particular class will
		                                                   //be accessed
		/*enter username,password and click on login button*/
		pages.actitimeLogin.login("admin", "manager");
		/*click on user*/
		pages.actitimeEnterTimetrack.clickUsers();
		/*click on adduser*/
		pages.actitimeUserList.clickNewUser();
		Thread.sleep(2000);
		/*enters firstname,lastname and email*/
		pages.adduser.addUsers("shesha", "raghunandan", "abc@gamil.com");
}
}
