package javascript_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for disabled textbox using javascript*/
public class P1 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium%20html/selenium7.html");
		/*convert the object from WebDriver to JavascriptExecutor*/
		JavascriptExecutor j=(JavascriptExecutor) driver;
		/*identifies and enter the data into disabled textfiels*/
		j.executeScript("document.getElementById('i1').value='selenium'");
}
}