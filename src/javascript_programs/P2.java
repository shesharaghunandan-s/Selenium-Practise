package javascript_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for scrolling*/
public class P2 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.actitime.com/");
		Thread.sleep(5000);
		/*to find the element*/
		WebElement element = driver.findElement(By.xpath("//div[text()='Start with actiTIME for free']"));
		/*to get the value of x and y co-ordinates of a element from side of webpage and top of web page respectively*/
		int X = element.getLocation().getX();
		int Y = element.getLocation().getY();
		/*convert the object from WebDriver to JavascriptExecutor*/
		JavascriptExecutor j=(JavascriptExecutor) driver;
		/*scroll to specific location*/
		j.executeScript("window.scrollBy("+X+","+Y+")");//we cannot directly write "window.ScrollBy(X,Y)" because everything inside double invited comma will be 
		                                                //a characer and 'X' and 'Y' will be treated as character instead of variabl
}	
}
		