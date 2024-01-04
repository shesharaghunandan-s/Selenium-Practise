package webelement_programs;
      import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class fblogin1 {
		public static void main(String[] args) {
				
				/* sets the path for chromedriver.exe*/
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				
				/* launch the chrome browser */
				ChromeDriver driver = new ChromeDriver();
				
				
				/* search the web app and waits until it is loaded completly */
				driver.get("https://www.facebook.com/");
				
				
				/* identifies the username and enters the data*/
				driver.findElement(By.id("email")).sendKeys("shesha");//it is combination of two statement they are 1.webElement username=driver.findElement(By.id("email")) and 2.username.sendKeys("shesha")
				                                                        //in place of username in 2nd statement we write driver.findElement(By.id("email")
			                                                            
				
				/*identifies the password and enters the data*/
				driver.findElement(By.id("pass")).sendKeys("12345");
				
				/*identifies the login button and click on it*/
				driver.findElement(By.name("login")).click();

}
}