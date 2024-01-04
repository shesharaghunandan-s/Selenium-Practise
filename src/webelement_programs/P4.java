package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*program using getsize() to check get size of textfields*/
public class P4 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/*identify the user name*/
		WebElement un = driver.findElement(By.name("username"));
		/*identify the password*/
		 WebElement pwd= driver.findElement(By.name("pwd"));
		 /*retrive the height and width of user name*/
		 int h1 = un.getSize().getHeight();
		 int w1 = un.getSize().getWidth();
		 /*retrive the height and width of password*/
		 int h2 = pwd.getSize().getHeight();
		 int w2 = pwd.getSize().getWidth();
		 /*validate whether username and password are of same height*/
		 if(h1==h2&& w1==w2)
		 {
			 System.out.println("pass:un and pwd are of same dimension");
		 }
		 else
		 {
			 System.out.println("fail:un and password are not of same dimension");
		 }
				
		
}
}