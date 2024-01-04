package webdriver_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
public static void main(String[] args) throws InterruptedException {
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		/* launch the chrome browser */
		 WebDriver driver = new ChromeDriver();
		
		/* maximize the windows*/
		driver.manage().window().maximize();
		
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		
		/*identifies the follow all button and click on it*/
		driver.findElement(By.id("followall")).click();
		
		Thread.sleep(5000);
		/*closes all the windows*/
		driver.quit();//close method will close window in which control is present but quit method will close all windows opened
      }

}
