package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/*identify the chechh box*/
		WebElement CB = driver.findElement(By.id("keepLoggedInCheckBox"));
		/*check whether the checkbox is selected*/
		System.out.println(CB.isSelected());
		/*click on checkbox*/
		CB.click();
		/*check whether the checkbox is selected*/
		System.out.println(CB.isSelected());
}
}