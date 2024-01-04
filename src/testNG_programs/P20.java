package testNG_programs;

import org.testng.annotations.Test;
/*program for execution multiple time using invocation count*/
public class P20 {
	@Test(priority=-5,invocationCount=3)
	public void fbloginscript() {
		System.out.println("fb login script");
	}
	
	@Test(invocationCount=5)//if no priority is given then default priority will be zero
	public void myntraScript() {
		System.out.println("myntra script");
	}
	
	@Test
	public void actitimeloginscript() {
		System.out.println("actitime login script");
	}
}
