package testNG_programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P15 {
	@Test
	public void actiLoginScript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    /*validating whether checkbox ic selected*/
		WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
		Assert.assertTrue(cb.isSelected());
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	    driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
}
}
