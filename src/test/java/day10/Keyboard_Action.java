package day10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://demo.nopcommerce.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	       WebElement Register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	       Thread.sleep(3000);
	       Actions act = new Actions(driver);
	       
	       act.keyDown(Keys.CONTROL).click(Register).keyUp(Keys.CONTROL).perform();
	       
	      Set <String> wids = driver.getWindowHandles();     
	      List <String> wid  = new ArrayList(wids);
	      
	      String parent = wid.get(0);
	      String child = wid.get(1);
	      
	      driver.switchTo().window(child);
	      driver.close();
	      
	
	}

}
