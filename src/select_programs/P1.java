package select_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*program for selecting  options in listbox*/
public class P1 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("file:///C:/Users/SHESHA%20RAGHUNANDAN/Desktop/selenium%20html/select.html");
		/*identify the listbox*/
		WebElement listbox = driver.findElement(By.id("KB"));
		/*create the object of select class*/
		Select s=new Select(listbox);//we can use select method to identify the listbox only if listbox has tagname as 'select'
		/*select the option based on value*/
		s.selectByValue("B");//we can use select method to identify the options of textbox only if we have options with tagname'option'
		/*select the option based on text*/
		s.selectByVisibleText("Tandoori");
		/*select the option based on index*/
		s.selectByIndex(4);
}
}
