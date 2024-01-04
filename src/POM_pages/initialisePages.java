package POM_pages;

import org.openqa.selenium.WebDriver;

public class initialisePages {

	public actitimeLogin_page2 actitimeLogin;//(this is s variable which can store the address of the page actitimelogin_page2 )
	public actitimeEnterTimetrack2 actitimeEnterTimetrack;
	public actitimeUserList_page2 actitimeUserList;
	public addUser_page2 adduser;
	
	public initialisePages(WebDriver driver)//(method is used to initialise the variables)
	{
		this.actitimeLogin=new actitimeLogin_page2(driver);//(object of actitimeLogin_page2 is created and it will be store in actitimeLogin)
		this.actitimeEnterTimetrack=new actitimeEnterTimetrack2(driver);
		this.actitimeUserList=new actitimeUserList_page2(driver);
		this.adduser=new addUser_page2(driver);
	}
	
}
