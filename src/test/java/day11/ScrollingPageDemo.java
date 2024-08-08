package day11;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		 WebDriver driver = new ChromeDriver();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	        driver.get("https://www.orangehrm.com/");
	        driver.manage().window().maximize();
	        
	        JavascriptExecutor js = driver;
	        
	        // Scroll page by pixel
	        js.executeScript("window.scrollBy(0,500)", "");
	        Thread.sleep(3000);
	        System.out.println(js.executeScript("return window.pageYOffset;", ""));  
	        
	        Thread.sleep(5000);
	        //Scroll down to specific Element
	        WebElement text = driver.findElement(By.xpath("//p[@class='about-details']"));
	        js.executeScript("arguments[0].scrollIntoView();", text);
	        Thread.sleep(3000);
	        System.out.println(js.executeScript("return window.pageYOffset;")); 
	        Thread.sleep(5000);
	        // Scroll to the end of the Page 
	        
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	        System.out.println(js.executeScript("return window.pageYOffset;")); 
	        
//	        // Scroll to the start of the Page
	        
	        Thread.sleep(5000);
	         js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
	        System.out.println(js.executeScript("return window.pageYOffset;")); 
	        
	        
	        
	}
}
