package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		String text = driver.findElement(By.xpath("//a[normalize-space()='Register']")).getText();
		
		System.out.println(text);
				
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Hello");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//*[normalize-space(text())='Wishlist']")).click();
		
		driver.findElement(By.xpath("//[@id='small-searchterms']")).sendKeys("Computers");
		driver.findElement(By.xpath("//[@class='button-1 search-box-button']")).click();

		driver.findElement(By.xpath("//a[text()='Register']")).click();

		driver.findElement(By.xpath("//a[contains(text(), 'ster')]")).click();

// 						and OPERATOR		
		driver.findElement(By.xpath("//input[@type='text' and @id='small-searchterms']")).click();
	}
}
