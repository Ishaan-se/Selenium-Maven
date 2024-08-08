package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {

		
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://text-compare.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	        Thread.sleep(3000);
	       WebElement textarea = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	        textarea.sendKeys("Happy Birthday Bro");
	        Actions act = new Actions(driver);
	        
	        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	        Thread.sleep(10000);
	        act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	        act.keyDown(Keys.ENTER);
	        
	}

}
