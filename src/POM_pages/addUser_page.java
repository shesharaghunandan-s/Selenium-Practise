package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM class for add  user page*/
public class addUser_page {
	    /*identifies the firstname */
		@FindBy(xpath="(//input[@name='firstName'])[2]")
		public WebElement tbFirstName;
		 /*identifies the last name */
		@FindBy(xpath="(//input[@name='lastName'])[2]")
		public WebElement tbLastName;
		 /*identifies the email */
		@FindBy(xpath="(//input[@name='email'])[2]")
		public WebElement tbEmail;
		 /*identifies the save and send button */
		@FindBy(xpath="//div[text()='Save & Send Invitation']")
		public WebElement btnSave;
		
		public addUser_page(WebDriver driver)
		{
		/*initialises the webelements*/
		PageFactory.initElements(driver, this);
		}
}
