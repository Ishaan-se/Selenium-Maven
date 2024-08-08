package day15;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class AnnotationsClass {

@BeforeClass
	void Login()
	{
	System.out.println("This is login");
	}

	@Test(priority=1)
	void Search () 
	{
		
		System.out.println("This is search method ");	
		
		}
	@Test(priority=2)
	void AdvancedSearch()
	{
		System.out.println("This is advanced  search method ");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout method ");
		
	

	}

}
