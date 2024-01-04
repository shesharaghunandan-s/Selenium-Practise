package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_pages.initialisePages;

public class P13 {
	
	@Test(dataProviderClass=actitimeDataProviders.class,dataProvider="addUserData")
	public void addUserScript(String un,String pw,String fn,String ln,String em) throws InterruptedException	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		initialisePages pages = new initialisePages(driver);
		pages.actitimeLogin.login(un,pw);
		pages.actitimeEnterTimetrack.clickUsers();
		pages.actitimeUserList.clickNewUser();
		Thread.sleep(2000);
		pages.adduser.addUsers(fn, ln, em);
}
}
