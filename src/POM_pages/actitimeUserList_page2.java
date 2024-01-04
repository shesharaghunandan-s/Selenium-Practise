package POM_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM class for user page*/
public class actitimeUserList_page2 {
    /*identifies the departments button*/
	@FindBy(xpath="(//div[contains(text(),'  Departments')])[1]")
	private WebElement btnDepartments;
	/*identifies the new user button*/
	@FindBy(xpath="//div[text()='New User']")
	private WebElement btnNewUser;
	/*identifies the vulk invitations button*/
	@FindBy(xpath="//div[text()='Bulk Invitations']")
	private WebElement btnBulkInvitations;
	
	public actitimeUserList_page2(WebDriver driver)
	{
	/*initialises the webelements*/
	PageFactory.initElements(driver, this);
	}
	/*method to click on department*/
	public void clickDepartments()
	{
		this.btnDepartments.click();
	}
	/*method to click on department*/
	public void clickNewUser()
	{
		this.btnNewUser.click();
	}
	/*method to click on department*/
	public void clickBulkInvitations()
	{
		this.btnBulkInvitations.click();
	}
}
