package day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conditional_methods {

	public static void main(String[] args) throws InterruptedException {
	
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		// isDisplayed()
		
		Boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("The logo is displayed: " + logo);
		
		//isEnabled()
		
		Boolean textbox = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println("The textbox is enabled: " + textbox);
	
 		//isSelected()
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		male.click();
		System.out.println("Radio button male is selected: " +male.isSelected());
		
		Thread.sleep(3000);
		driver.close();
	
	}	

}
