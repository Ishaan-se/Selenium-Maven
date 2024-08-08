package day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

@Test
void softassertion()
{
System.out.println("Testing..");	
System.out.println("Testing..");
System.out.println("Testing..");

SoftAssert sa = new SoftAssert();

sa.assertTrue(false);

System.out.println("Chlo mai execute ho hi jata hu tum bhi kya yaad rakhoge ");

Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);

sa.assertAll();
}

	

}
