package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.com");
}
}
