package day7;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framez {

	public static void main(String[] args) throws InterruptedException {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        
//			 Maximizes the Window
     		driver.manage().window().maximize();

////     		 Scroll down using sendKeys to the body
//     		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Keys.PAGE_DOWN);
//     		Thread.sleep(1000);
//     	// Adding a small delay to ensure the page is scrolled
        
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Frames ");
        
        Thread.sleep(3000);
        
        //Approach 1
//        driver.switchTo().frame("frm1");
     
//     WebElement dropdown = driver.findElement(By.xpath("//*[@id="selectnav2"]/option[1]"));
//     
//     Select options = new Select(dropdown);
//     
//     dropdown.selectByVisibleText("- Java");
     
// 		Approach -2
        
        WebElement frame1 = driver.findElement(By.xpath("//*[@id="selectnav2"]/option[1]"));
        
        
        driver.switchTo().defaultContent();
	}

}