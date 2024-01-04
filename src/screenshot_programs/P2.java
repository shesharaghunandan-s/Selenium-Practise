package screenshot_programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		/* launch the chrome browser */
		WebDriver driver = new ChromeDriver();
		/* maximize the windows*/
		driver.manage().window().maximize();
		/* search the web app and waits until it is loaded completly */
		driver.get("https://demo.actitime.com/login.do");
		/*retrive the title of webpage*/
		String title = driver.getTitle();//difference between previous program and this program is that in this program every time screenshot will be stored 
		                                 //as a seperate image instead of replacing old one as it use to happen in previous program
		/*convert the object from webdriver to takescreenshot typr*/
		TakesScreenshot t=(TakesScreenshot)driver;//first write left side of statement and then right side
		/*
		 * capture the screenshot and return it in form of 
		 * java file class object
		 */
		File src = t.getScreenshotAs(OutputType.FILE);
		/*
		 * create the object of java file class,which will point
		 * towards the physical file
		 */
		File dest = new File("./screenshot/"+title+".png");
		/*copies the content from src to dest*/
		FileUtils.copyFile(src, dest);
}
}