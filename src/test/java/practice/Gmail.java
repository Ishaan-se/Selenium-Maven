package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        // Locate the username field and enter username
//        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));
//        usernameField.sendKeys("yourusername@gmail.com");

        // Click the Next button
        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']/.."));
        nextButton.click();

        // Locate the password field and enter password
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        passwordField.sendKeys("yourpassword");

        // Click the Next button
        WebElement passwordNextButton = driver.findElement(By.xpath("//span[text()='Next']/.."));
        passwordNextButton.click();

        // Verify login is successful by checking if the compose button is visible
        WebElement composeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compose']")));

        if (composeButton.isDisplayed()) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }
        driver.quit();
    }
}
