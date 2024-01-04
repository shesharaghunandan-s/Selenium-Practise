package apache_programs;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_pages.initialisePages;
public class P5 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {	
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
		initialisePages pages = new initialisePages(driver);
		/*enter username,password and click on login button*/
		pages.actitimeLogin.login(P4.getdata("logincr", 1, 0), P4.getdata("logincr", 1, 1));
		/*click on user*/
		pages.actitimeEnterTimetrack.clickUsers();
		/*click on adduser*/
		pages.actitimeUserList.clickNewUser();
		Thread.sleep(2000);
		/*enters firstname,lastname and email*/
		pages.adduser.addUsers(P4.getdata("adduser", 1, 0), P4.getdata("adduser", 1, 1), P4.getdata("adduser", 1, 2));
}
}