package day17;
import day17.Login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class LoginTest {

	
	Login obj;
	WebDriver driver;
@BeforeClass
void setup() throws Exception
{
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);
}


  @Test
  public void testLogin() 
  {

  obj.setUserName("Admin");
  obj.setPassword("admin123");
  obj.clickSubmit();
  
  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
  
  @Test(priority=1)
  void Logo_check()
  {
	  obj = new Login(driver);
	  
  }
	@AfterTest
	void tearDown() {
		driver.close();
	}

  
  
}
