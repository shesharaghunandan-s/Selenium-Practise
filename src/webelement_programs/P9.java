package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for isEnabled()*/
public class P9 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium%20html/selenium7.html");
		/*identify the textbox*/
		WebElement textBox = driver.findElement(By.id("i1"));
		/*chech whether textbox is enabled*/
		System.out.println(textBox.isEnabled());//we cannot enter data into disabled textfield but we can do it through javascript as done in selenium7(chrome)
}
}
