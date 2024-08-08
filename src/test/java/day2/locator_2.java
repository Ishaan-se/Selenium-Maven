package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
						// CSS SELECTORS
public class locator_2 {

	public static void main(String[] args) throws Exception {

	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		// tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("M");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("ac ");
		
		//tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Bo");
		
		// tag and attribute input[name='q']
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("o");
		
		// tag name class and attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("k ");
		
		driver.findElement(By.cssSelector("button.button-1")).click(); //tag.class
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
