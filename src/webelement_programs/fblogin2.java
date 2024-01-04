package webelement_programs;
      import org.openqa.selenium.By;
    //finding elements using cssselector//
		import org.openqa.selenium.chrome.ChromeDriver;
		public class fblogin2 {
		public static void main(String[] args) {
				
				/* sets the path for chromedriver.exe*/
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				
				/* launch the chrome browser */
				ChromeDriver driver = new ChromeDriver();
				
				
				/* maximize the windows*/
				driver.manage().window().maximize();
				
				
				/* search the web app and waits until it is loaded completly */
				driver.get("https://www.facebook.com/");
				
				
				/* identifies the username and enters the data*/
				driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("shesha");
			                                                            
				
				/*identifies the password and enters the data*/
				driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("1234");
				
				/*identifies the login button and click on it*/
				driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();

}
}