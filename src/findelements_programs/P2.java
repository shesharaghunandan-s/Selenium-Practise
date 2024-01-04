package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*programs for findelements()*/
public class P2 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.facebook.com/");
		/*identify all the matching web elements*/
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		  /*return the type of list*/
		  System.out.println(links.getClass().getName());//Class<? extends List> p1 = links.getClass();
		                                                 //                          String p2 = p1.getName();
		                                                 //                            System.out.println(p2);
		  /*return the size of list*/
		  System.out.println(links.size());
}
}