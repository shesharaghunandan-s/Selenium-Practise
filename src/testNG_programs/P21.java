package testNG_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P21 {
	@Test(dependsOnMethods= {"loginScript","usersScript"})
	public void addUsersScript(){
		System.out.println("add users script");
	}
	
	@Test
	public void loginScript() {
		System.out.println("login script");
	}
	
	@Test(dependsOnMethods= {"loginScript"})
	public void usersScript() {
		System.out.println("users script");
		Assert.fail();
	}
}
