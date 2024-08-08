package day15;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Test {

@BeforeTest
	void beforeTest()
	{
	System.out.println("This is before Test");
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
	
	@AfterTest
	void afterTest()
	{
		System.out.println("This is after Test ");	

	}

}
