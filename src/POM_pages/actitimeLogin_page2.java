package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM classes for login page*/          //(this program and actitime loginscript program are linked but written in seperate package)
public class actitimeLogin_page2 {
	
	    /*identifies username*/
         @FindBy(name="username")
         private WebElement tbUsername;
         /*identifies password*/
         @FindBy(name="pwd")
         private WebElement tbPassword;
         /*identifies loginbutton*/
         @FindBy(id="loginButton")
         private WebElement btnLogin;
         
        /*constructor for intializing variables*/
		public actitimeLogin_page2(WebDriver driver)
		{
			/*initialises the webelements*/
       	 PageFactory.initElements(driver, this);
		}
		/*method to enter username*/
		public void setUsername(String un)
		{
			this.tbUsername.sendKeys(un);
		}
		/*method to enter password*/
		public void setPassword(String pw)
		{
			this.tbPassword.sendKeys(pw);
		}
		/*method to click on login button*/
		public void clickLogin()
		{
			this.btnLogin.click();
		}
		/*method for login*/          //(above methoda are combined to form one method)
		public void login(String un,String pw)
		{
			this.tbUsername.sendKeys(un);
			this.tbPassword.sendKeys(pw);
			this.btnLogin.click();
		}
}
