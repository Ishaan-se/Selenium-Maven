package practice;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {

		public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://testautomationpractice.blogspot.com/");
			WebElement e= driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
			e.click();
			driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");

			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[1]/div[1]/div[2]/div[1]/a")).click();
			 driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
			 driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
			 driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
			 String windowhandles=driver.getWindowHandle();
			 Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles
			 for (String handle : windowHandles) {
			     if (!handle.equals(windowHandles)) {
			         driver.switchTo().window(handle); // Switch to the pop-up window
			         break;}}
			   System.out.println( driver.getTitle());
			    driver.close();
			     driver.switchTo().window(windowhandles);
			}
			

	}


