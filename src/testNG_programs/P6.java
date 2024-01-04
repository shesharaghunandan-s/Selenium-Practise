package testNG_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class P6 extends Basetest1{
	@Test
	public void fbLoginScript()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shesha");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
	}
}
