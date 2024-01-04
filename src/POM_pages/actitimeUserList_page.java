package POM_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM class for user page*/
public class actitimeUserList_page {
    /*identifies the departments button*/
	@FindBy(xpath="(//div[contains(text(),'  Departments')])[1]")
	public WebElement btnDepartments;
	/*identifies the new user button*/
	@FindBy(xpath="//div[text()='New User']")
	public WebElement btnNewUser;
	/*identifies the vulk invitations button*/
	@FindBy(xpath="//div[text()='Bulk Invitations']")
	public WebElement btnBulkInvitations;
	
	public actitimeUserList_page(WebDriver driver)
	{
	/*initialises the webelements*/
	PageFactory.initElements(driver, this);
	}
}
