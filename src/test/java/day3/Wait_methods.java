package day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Wait_methods {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		// OPEN URL -- get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// USERNAME 
		driver.findElement(By.name("userName")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		//PASSWORD
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(3000);
		// LOGIN

	}

}
