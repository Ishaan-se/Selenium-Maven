package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//input[@id='field1'] ")).clear();
        driver.findElement(By.xpath("//input[@id='field1'] ")).sendKeys("Today is Wednessday");
      
        WebElement button = driver.findElement(By.xpath(" //button[normalize-space()='Copy Text']"));
      	Actions act = new Actions(driver);
        act.doubleClick(button).perform();
        
        
        
        
        
        Thread.sleep(3000);
//        driver.close();
        
	}

}
