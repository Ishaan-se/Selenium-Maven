package day15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

@Test
void hardassertion()
{
System.out.println("Testing..");	
System.out.println("Testing..");
System.out.println("Testing..");

Assert.assertTrue(false);

System.out.println("Mai execute nhi hounga ");

Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);

}

	

}
