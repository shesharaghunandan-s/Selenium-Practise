package testNG_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p5 extends Basetest1 {
	@Test
	public void actiLoginScript()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	}
}
