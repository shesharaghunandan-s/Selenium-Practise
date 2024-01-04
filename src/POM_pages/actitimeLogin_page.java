package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM classes for login page*/          //(this program and actitime loginscript program are linked but written in seperate package)
public class actitimeLogin_page {
	
	    /*identifies username*/
         @FindBy(name="username")
         public WebElement tbUsername;
         /*identifies password*/
         @FindBy(name="pwd")
         public WebElement tbPassword;
         /*identifies loginbutton*/
         @FindBy(id="loginButton")
         public WebElement btnLogin;
        /*constructor for intializing variables*/
		public actitimeLogin_page(WebDriver driver)//if we try to create a object of this class in 'loginscript' class using constructor in that class
		                                           // without using constructor here means variable accessed  from 'loginscrip' will not be initialized and we get null pointer 
		                                           // exception 
		{
			/*initialises the webelements*/
       	 PageFactory.initElements(driver, this);
		}
		
		
}
