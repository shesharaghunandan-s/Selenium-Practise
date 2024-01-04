package testNG_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P12 {

	@DataProvider(parallel=true)//parallel=true is given to have parallel exection where in 3 browsers actitime page is opened and different 'un' 'pw' set is used
	                                                  //e.g:(set1=admin,manager;set2=trainee,12345;set3=amith,baby)
	public Object[][] actitimeLoginData(){
		Object[][] data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="manager";
		data[1][0]="trainee";
		data[1][1]="12345";
		data[2][0]="amith";
		data[2][1]="baby";
		return data;
	}
	
	@Test(dataProvider="actitimeLoginData")
	public void actiLoginScript(String un,String pw)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(un);
	   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(pw);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		driver.quit();
	}
}
