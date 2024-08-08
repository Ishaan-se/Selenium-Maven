package day15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethods {

@Test(priority=1)
void openUrl()
{
Assert.assertTrue(true);

}

@Test(priority=2,dependsOnMethods= {"openUrl"})
void login()
{
Assert.assertTrue(true);

}

@Test(priority=3,dependsOnMethods= {"login"})
void search()
{
Assert.assertTrue(false);

}

@Test(priority=4,dependsOnMethods= {"search","login"})
void advancedsearch()
{
Assert.assertTrue(true);

}

@Test(priority=5,dependsOnMethods= {"login"})
void logout()
{
Assert.assertTrue(true);

}

}
