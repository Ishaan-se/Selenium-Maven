package day14;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

								// TEST NG
public class Second_Test {
	
	ChromeDriver driver;
	@Test(priority=1)
	void tearUp()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}

	@Test(priority=2)
	void logo() throws InterruptedException
	{
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Thread.sleep(3000);
		if (logo.isDisplayed())
		{
		System.out.println("Logo is displayed ");	
		
		}
		else 
		{
			System.out.println("Logo is not displayed ");	
		}
		}
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test(priority=4)
	void teardown()
	{
		driver.close();
		
	}
	
}
