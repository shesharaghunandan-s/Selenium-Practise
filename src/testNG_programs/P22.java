package testNG_programs;

import org.testng.annotations.Test;
/*program for groups*/
public class P22 {
	
	@Test(groups= {"functional","smoke"})
	public void Script1() {
		System.out.println("Script-1");
	}
	
	@Test(groups= {"functional"})
	public void  Script2() {
		System.out.println("Script-2");
	}
	
	@Test(groups= {"smoke"})
	public void  Script3(){
		System.out.println("Script-3");
	}
	
	@Test(groups= {"system"})
	public void  Script4(){
		System.out.println("Script-4");
	}
	
	@Test(groups= {"system"})
	public void  Script5(){
		System.out.println("Script-5");
	}

}

