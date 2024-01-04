package select_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*program to handle dropdown(if drop down has select as tagname) with select method */
public class P6 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/*waits till elements are found*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.facebook.com/");
		/*find element and click o it*/
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		/*handle day dropdown*/
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select s1=new Select(dayDropDown);
		s1.selectByValue("1");
		/*handle month dropdown*/
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select s2 = new Select(monthDropDown);
		s2.selectByValue("8");
		/*handle year dropdown*/
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select s3 = new Select(yearDropDown);
		s3.selectByValue("1998");
}
}