package day16;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelDemo {
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	void Setup(String br) throws InterruptedException {
		switch(br) {
		case "Chrome" :
		driver = new ChromeDriver();
		Thread.sleep(3000);
		break;
		
		case "Firefox" : 
		driver = new FirefoxDriver();
		Thread.sleep(3000);
		break;
		
		case "Edge" : 
		driver = new EdgeDriver();
		Thread.sleep(3000);
		break;
		
		default:
		System.out.println("Invalid Browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test (priority = 1)
	void Logo() throws InterruptedException {
		Thread.sleep(3000);
		Boolean logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed();
		if(logo)
			Assert.assertTrue(true);
		else
			Assert.fail();
	}
	
	@Test (priority = 2)	
	void Login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterTest
	void tearDown() {
		driver.close();
	}
  
}