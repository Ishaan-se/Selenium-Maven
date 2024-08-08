package day8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // Switch to the iframe containing the datepicker
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame1);

        // Click on the datepicker input field to open the calendar
        WebElement datepickerInput = driver.findElement(By.id("datepicker"));
        datepickerInput.click();

        // Set the initial date, assuming it opens the calendar for selection
        datepickerInput.sendKeys("12/25/2010");

        // Target year and month to select
        String targetYear = "2025";
        String targetMonth = "June";

        // Loop to navigate to the desired year and month
        while (true) {
            WebElement yearElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            WebElement monthElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

            String currentYear = yearElement.getText();
            String currentMonth = monthElement.getText();

            if (targetYear.equals(currentYear) && targetMonth.equals(currentMonth)) {
                break;
            }

            // Click on the next button to navigate to the next month
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        // Select the desired date in the calendar
        String targetDate = "20";
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        
        for (WebElement date : allDates) {
            if (date.getText().equals(targetDate)) {
                date.click();
                break;
            }
        }
        
        for (int i = 0; i < allDates.size(); i++) {
            WebElement date = allDates.get(i);
            if (date.getText().equals(targetDate)) {
                date.click();
                break;
            }
        }

        Thread.sleep(3000);

        driver.close();
    }
}
