package day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
	
		// PAVADA
		List <WebElement> imageslider = driver.findElements(By.className("homeslider-container"));
		System.out.println(imageslider.size());
		
		List <WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

	}
}
