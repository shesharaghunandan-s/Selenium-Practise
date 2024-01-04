package testNG_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class P8 extends Basetest2 {
	@Test
	public void fbLoginScript()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shesha");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
	}
}
