package day3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_demo {

	public static void main(String[] args) {
		
	FirefoxDriver driver = new FirefoxDriver();
		
		// OPEN URL -- get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		//IMPLICIT WAIT 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// USERNAME 
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//PASSWORD
		driver.findElement(By.name("password")).sendKeys("admin123");
		

	}

}
