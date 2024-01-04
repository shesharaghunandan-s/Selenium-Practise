package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* program using getlocation method to get location of element in form of co-ordinates*/
public class P5 {
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
		/*printing co-ordinates of element*/
		System.out.println(X+","+Y);
		
}	
}