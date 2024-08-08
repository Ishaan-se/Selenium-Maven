package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

		public class Amazon {
		    public static void main(String[] args) throws InterruptedException {
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("https://www.amazon.in");

		        // Locate the link with text "Click me" and click it
		        driver.findElement(By.linkText("Click me")).click();

		        // Wait for 5 seconds
		        Thread.sleep(5000);

		        // Verify that the new page's URL contains the string "newpage"
		        String currentUrl = driver.getCurrentUrl();
		        if (currentUrl.contains("newpage")) {
		            System.out.println("Navigation successful.");
		        } else {
		            System.out.println("Navigation failed.");
		        }

		        driver.quit();
		        
		        
		         
		        
		        
		        
		        
		        
		        
		        
		        
		        System.out.println("Navigation successful.");
		        
		    }
	}
