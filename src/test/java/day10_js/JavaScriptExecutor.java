package day10_js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
//		 WebDriver driver = new ChromeDriver();
			ChromeDriver driver = new ChromeDriver();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().window().maximize();
	        
	        JavascriptExecutor js = driver;

	        WebElement inputbox = driver.findElement(By.id("name"));
	        
	        js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
	        
//   WebElement  = driver.findElement(By.id("name"));
//	        
//	        js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
	        
	}

}
