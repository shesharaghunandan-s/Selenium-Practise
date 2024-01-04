package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM classes for landing page*/
public class actitimeEnterTimetrack {
	 /*identifies tasks*/
    @FindBy(xpath="//a[@class='content tasks']")
    public WebElement lnkTasks;
    
    /*identifies reports*/
    @FindBy(xpath="//a[@class='content reports']")
    public WebElement lnkReports;
    
    /*identifies users*/
    @FindBy(xpath="//a[@class='content users']")
    public WebElement lnkUsers;
    
    /*identifies logoutbutton*/
    @FindBy(xpath="//a[@id='logoutLink']")
    public WebElement btnLogout;
    
	public actitimeEnterTimetrack(WebDriver driver)
{
/*initialises the webelements*/
PageFactory.initElements(driver, this);
}

}
