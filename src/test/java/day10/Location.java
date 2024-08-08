package day10;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args) {
		
			 ChromeDriver driver = new ChromeDriver();
		        driver.get("https://www.nopcommerce.com/en");
		        driver.manage().window().maximize();

		        WebElement logo = driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		        System.out.println("before" + logo.getLocation());
		        driver.manage().window().maximize();
		        System.out.println("max" + logo.getLocation());
		        driver.manage().window().minimize();
		        System.out.println("min" + logo.getLocation());
		        driver.manage().window().fullscreen();
		        System.out.println("full" + logo.getLocation());
		        Point p = new Point (40,12);
		        driver.manage().window().setPosition(p);
		        
		}
	}