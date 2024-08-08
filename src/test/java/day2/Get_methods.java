package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_methods {
    public static void main(String[] args) throws InterruptedException {
 
        FirefoxDriver driver = new FirefoxDriver();       
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000); 
         // Click on the link to open a new window/tab
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        
        // Title of the current window
        System.out.println("Title of the current window: " + driver.getTitle());
        // URL of the current window
        System.out.println("URL of the current window: " + driver.getCurrentUrl());
        
        // Window Handle
        String originalHandle = driver.getWindowHandle();
        // Window Handles
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String> (windowHandles);
        
        if (handlesList.size() > 1) {
            String newHandle = handlesList.get(1); // New handle (child window/tab)
            System.out.println("Original Window Handle: " + originalHandle);
            System.out.println("New Window Handle: " + newHandle);
            
            // Switch to the new window/tab
            driver.switchTo().window(newHandle);
            
            // Title of the new window/tab
            System.out.println("Title of the new window/tab: " + driver.getTitle());
            
            // Close the new window/tab
            driver.close();
            
            // Switch back to the original window/tab
            driver.switchTo().window(originalHandle); 
        }	
        else {
            System.out.println("No new window/tab was opened.");
        }
        
        // Close the original window/tab and quit the browser
        driver.quit();
    }
}
