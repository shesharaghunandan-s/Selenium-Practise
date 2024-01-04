package apache_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for reading data from properties file*/
public class P6 {
public static void main(String[] args) throws IOException {
	FileInputStream f = new FileInputStream("./data/actitime.properties");
	Properties p = new Properties();//properties class from 'java.util' pacakage
	p.load(f);
	
	System.out.println(p.getProperty("url"));//In 'properties file' data will be stored in 'key-value' pair
	System.out.println(p.getProperty("username"));
	System.out.println(p.getProperty("password"));
		
	/* sets the path for chromedriver.exe*/
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	/* launch the chrome browser */
	ChromeDriver driver = new ChromeDriver();
	/*defines implicitly wait of 30 sec*/
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	/* maximize the windows*/
	driver.manage().window().maximize();
	/* search the web app and waits until it is loaded completly */
	driver.get(p.getProperty("url"));
	/* identifies the username and enters the data*/
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys(p.getProperty("username"));
	/*identifies the password and enters the data*/
   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(p.getProperty("password"));
	/*identifies the login button and click on it*/
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
}
}
