package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		/*retrive the tagname of element*/
		String tn = link.getTagName();
		System.out.println(tn);
		System.out.println("-------------------");
		/*retrive the attributes of element*/
		String att1 = link.getAttribute("href");
		String att2 = link.getAttribute("target");
		System.out.println(att1);
		System.out.println(att2);
		System.out.println("------------------");
		/*retrive css value*/
		 String css1 = link.getCssValue("font-size");
		String css2 = link.getCssValue("color");
		System.out.println(css1);
		System.out.println(css2);
}
}