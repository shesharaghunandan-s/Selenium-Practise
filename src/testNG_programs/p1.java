package testNG_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p1 {

	@BeforeSuite
	public void BeforeSuit()
	{
		System.out.println("before suit");
	}
	
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("after suit");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("before Test");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("after test");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void BeforeMethod() 
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void AfterMethod() 
	{
		System.out.println("after method");
	}
	
	@Test
	public void script()
	{
		System.out.println("from script");
	}
}
