package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

	    // Maximizes the Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(5000);
		
		driver.close();
	}

}
