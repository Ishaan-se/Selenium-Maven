package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	        driver.manage().window().maximize();

	        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
	     
	System.out.println(slider.getLocation());
	
    Actions act = new Actions(driver);
    act.dragAndDropBy(slider, 100, 0).perform();
   
    System.out.println(slider.getLocation());
	}
}
