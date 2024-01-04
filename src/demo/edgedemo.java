package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgedemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edgr.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}
}
