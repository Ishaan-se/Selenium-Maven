package practice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) throws InterruptedException   {
	
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
	driver.findElement( By.xpath("//input[@type='submit']")).click();
	driver.getCurrentUrl();
	driver.get("https://en.wikipedia.org/wiki/Selenium");
	driver.navigate().back();
	driver.findElement( By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
    driver.getCurrentUrl();
    driver.get("https://en.wikipedia.org/wiki/Selenium_in_biology");
    driver.navigate().back();
	driver.findElement( By.xpath("//input[@type='submit']")).click();
    Thread.sleep(3000);
    driver.findElement( By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")).click();
    
	}

}
