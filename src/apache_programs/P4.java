package apache_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
public static String getdata(String sheetName,int rowno,int colno) throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("./data/Myexcel.xlsx");
	Workbook book = WorkbookFactory.create(f1);
	String d = book.getSheet(sheetName).getRow(rowno).getCell(colno).getStringCellValue();
	return d;
}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	/* sets the path for chromedriver.exe*/
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	/* launch the chrome browser */
	ChromeDriver driver = new ChromeDriver();
	/*defines implicitly wait of 30 sec*/
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	/* maximize the windows*/
	driver.manage().window().maximize();
	/* search the web app and waits until it is loaded completly */
	driver.get("https://demo.actitime.com/login.do");
	/* identifies the username and enters the data*/
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys(getdata("logincr", 1, 0));
	/*identifies the password and enters the data*/
   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(getdata("logincr", 1, 1));
	/*identifies the login button and click on it*/
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();	
}
}
