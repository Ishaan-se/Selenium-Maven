package day3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_demo {

	public static void main(String[] args) throws MalformedURLException {

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		URL link = new URL ("https://www.amazon.in/");
		
		driver.navigate().to(link);	
		System.out.println(driver.getCurrentUrl()); 	
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl()); 
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); 
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); 
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl()); 
		
		driver.close();
	}

}
