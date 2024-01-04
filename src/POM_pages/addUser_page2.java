package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM class for add  user page*/
public class addUser_page2 {
	    /*identifies the firstname */
		@FindBy(xpath="(//input[@name='firstName'])[2]")
		private WebElement tbFirstName;
		 /*identifies the last name */
		@FindBy(xpath="(//input[@name='lastName'])[2]")
		private WebElement tbLastName;
		 /*identifies the email */
		@FindBy(xpath="(//input[@name='email'])[2]")
		private WebElement tbEmail;
		 /*identifies the save and send button */
		@FindBy(xpath="//div[text()='Save & Send Invitation']")
		private WebElement btnSave;
		
		public addUser_page2(WebDriver driver)
		{
		/*initialises the webelements*/
		PageFactory.initElements(driver, this);
		}
		/*method to add user*/
		public void addUsers(String fn,String ln,String em)
		{
			this.tbFirstName.sendKeys(fn);
			this.tbLastName.sendKeys(ln);
			this.tbEmail.sendKeys(em);
			this.btnSave.click();
		}
}
