package day15;
import org.testng.Assert;
import org.testng.annotations.Test;
// VALIDATION OF TESTS using ASSERTIONS

public class Assertions {

@Test
void test()
{
	
//int x=10;
//int y=20;

//if (x==y)
//{
//	System.out.println("PASS");
//}
//else 
//{
//	System.out.println("FAIL");
//	}
//}

//Assert.assertEquals(x, y); // hard asserations
//Assert.assertTrue(true); // intentionally passing test
//Assert.assertTrue(false); // intentionally failing test
//Assert.fail(); // intentionally failing test

//	int a=30;
//	int b=20;
////	Assert.assertEquals(actual condition ,expected , description - runs only if test failed);
//	Assert.assertEquals(a<b,true,"a is not smaller than b");

//	String s = "hello";
//	String s1 = "helloo";
//	
//	Assert.assertEquals(s==s1, true, "s is not equal to s1");
	
	// IF ELSE Implementation
	int d = 10;
	int e = 20;
	
	
	if (d==e)
		Assert.assertTrue(true);
	else 
		Assert.fail();
	
	
	
}
}