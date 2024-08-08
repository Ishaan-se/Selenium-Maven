package day11;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = driver; 
		
//		Scroll page by pixel
		js.executeScript("window.scrollBy(0,500)", " ");
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;", " "));
		Thread.sleep(5000);
		
//		Scroll to specific element.
		WebElement text = driver.findElement(By.xpath("//h3[@class='text-center']"));
		js.executeScript("arguments[0].scrollIntoView();" , text);
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
//		Scroll to the end of page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)", " ");
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
//		Scroll to the start of the page
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)", " ");
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
//		driver.close();
	}

}