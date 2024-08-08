package day7;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To {

		public static void main(String[] args) throws Exception {
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
			
			Thread.sleep(3000);
	        // Get the handles of all open windows
	        Set<String> allWindows = driver.getWindowHandles();
	        System.out.println(allWindows);
	        
	        List <String > a1 = new ArrayList(allWindows);
	        
	        String parent = a[0];
	        String child = a(1);
	        
			
	        Thread.sleep(3000);

	}

}
