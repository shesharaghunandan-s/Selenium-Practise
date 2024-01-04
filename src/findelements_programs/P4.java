package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	public static void main(String[] args) throws InterruptedException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://www.flipkart.com/");
		/*to close the pop up that appear */
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		/*to select the search bar and enter the product to be searched*/
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("woodland shoes");
		/* to select the search butto and click*/
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		/*sleep is done to make shore the all elements are loaded*/
		Thread.sleep(4000);
		/*identify the name of all shoes in the web page*/
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		/*retrive the name and print it*/
	//	for(WebElement lv:titles)
//		{
	//		 String title = lv.getText();
	//		 System.out.println(title);
	//	}
		 
		
		/*identify the price of all shoes in the web page*/
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));
		      
		/*retrive the price and print it*/
	//	for(WebElement lv:prices)
	//	{
	//		String price = lv.getText();
	//		System.out.println(price);
	//	}		
	
	/*for loop is used to get name of product and price one after another*/
	for(int i=0;i<titles.size();i++)
	{
	String title = titles.get(i).getText();
     String price = prices.get(i).getText();
     System.out.println(title+"="+price);
		
}
	//driver.close();	

}
}