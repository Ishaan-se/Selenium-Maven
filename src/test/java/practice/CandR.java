package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CandR {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://example.com");

        // Interacting with Checkbox
        WebElement checkbox = driver.findElement(By.id("checkbox-id"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        // Interacting with Radio Button
        WebElement radioButton = driver.findElement(By.id("radio-button-id"));
        if (!radioButton.isSelected()) {
            radioButton.click();
        }

        driver.quit();
    }
}
