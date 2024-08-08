package day14;

import org.testng.annotations.Test;

								// TEST NG
public class First_Test {
	@Test(priority=1)
	void OpenURL()
	{
		System.out.println("This is Open URL ");
	}

	@Test(priority=2)
	void Login()
	{
		System.out.println("This is login ");
		
	}
	@Test(priority=3)
	void Logout()
	{
		System.out.println("This is logout ");
		
	}
	
	
}
