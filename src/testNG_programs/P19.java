package testNG_programs;

import org.testng.annotations.Test;
/*program for priority*/
public class P19 {
	@Test(priority=5)
	public void fbloginscript() {
		System.out.println("fb login script");
	}
	
	@Test(priority=5)
	public void myntraScript() {
		System.out.println("myntra script");
	}
	
	@Test(priority=5)
	public void actitimeloginscript() {
		System.out.println("actitime login script");
	}
}
