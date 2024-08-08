package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/notebooks");
		driver.manage().window().maximize();
		
		WebElement AddtoCart = driver.findElement(By.xpath("//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]"));
		AddtoCart.click();
		Thread.sleep(3000);
		
		WebElement ShoppingCart = driver.findElement(By.xpath("//span[@class='cart-qty']"));
		System.out.println(" Items in the cart: " + ShoppingCart.getText());
		Thread.sleep(3000);
		
		WebElement Shopping = driver.findElement(By.xpath("//span[@class='cart-label']"));
		Shopping.click();
		
		
		WebElement ProductName = driver.findElement(By.xpath("//a[@class='product-name']"));
		System.out.println("Product Name is :" + ProductName.getText());
		
		driver.close();
	}

}
