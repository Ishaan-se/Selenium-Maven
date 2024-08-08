package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class Switch_Window {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://example.com");

        // Click a link that opens a new window/tab
        driver.findElement(By.linkText("Open new window")).click();

        // Get the handle of the current window
        String originalWindow = driver.getWindowHandle();

        // Get the handles of all open windows
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to the new window
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        // Perform operations in the new window
        System.out.println("New window title: " + driver.getTitle());

        // Close the new window and switch back to the original window
        driver.close();
        driver.switchTo().window(originalWindow);

        driver.quit();
    }
}

	


