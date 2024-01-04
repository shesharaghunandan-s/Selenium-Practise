package testNG_programs;


import org.testng.annotations.Test;
/*program for priority*/
public class P17 {

	@Test(priority=5)
	public void fbloginscript() {
		System.out.println("fb login script");
	}
	
	@Test(priority=1)
	public void myntraScript() {
		System.out.println("myntra script");
	}
	
	@Test(priority=10)
	public void actitimeloginscript() {
		System.out.println("actitime login script");
	}
}
