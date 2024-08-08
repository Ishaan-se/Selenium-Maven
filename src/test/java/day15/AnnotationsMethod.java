package day15;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsMethod {

@BeforeMethod
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
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout method ");
		
	

	}

}
