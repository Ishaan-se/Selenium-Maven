package day16;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class Parameterization  {
		
		ChromeDriver driver;
		@BeforeClass
		void tearUp()
		{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F%22");
		
		}

		@Test(priority=1)
		void testUrl()
		{
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "https://demo.nopcommerce.com/login?returnUrl=%2F%22", "Url is not correct");
			}
		
		
		@DataProvider(name = "dp",indices = {0})
		
		String[][] loginData()
		{
			String data[][]= {{"ish0345678@gmail.com", "Pass1234"},{"madhav@gmail.com", "Pass3456"},{"nikhil@gmail.com", "Pass1234"}};
			return data;
		}
		
		
		
		@Test( priority=2, dataProvider = "dp")
		void login(String email, String pass)
		{
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
			
		}
		
		@AfterClass
		void teardown()
		{
			driver.close();
			
		}
		
	}
