package testNG_programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P9 {

	@Parameters("amith")
	@Test
	public void demoscript(String movie)
	{
		System.out.println("from the demo script");
		System.out.println(movie);
	}
}
//how to create a sueit(collection of class) for parallel run
//  1.select the scripr to be added to sueit
//  2.right click 
//  3.go to testNG and select 'convert' to TestNG
// 4.a xml file will be created(go to xml file and run in that to do parallel execution)