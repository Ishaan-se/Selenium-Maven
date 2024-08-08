package practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {
    public static void main(String[] args) {
        // Initialize WebDriver and navigate to the webpage
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        // Find the table element
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
        
        // Find all rows in the table (excluding header row)
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
        int rowsCount = rows.size();
        System.out.println("Total number of rows: " + rowsCount);
        
        // Find all columns in the header
        List<WebElement> headers = table.findElements(By.xpath("//tbody/tr/th"));
        int colsCount = headers.size();
        System.out.println("Total number of columns: " + colsCount);
        
        // Read specific row and column data (e.g., 2nd row, 1st column)
        try {
            WebElement specificCell = table.findElement(By.xpath(".//tbody/tr[2]/td[1]"));
            System.out.println("Data in 2nd row, 1st column: " + specificCell.getText());
        } catch (Exception e) {
            System.out.println("Error finding specific cell: " + e.getMessage());
        }
        
        // Read and print data from all rows and columns
        System.out.println("Table Data:");
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (int i = 0; i < cells.size(); i++) {
                System.out.print(cells.get(i).getText() + " ");
            }
            System.out.println();
        }
        
        // Print book names whose author is "Amit"
        System.out.println("Books authored by Amit:");
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() >= 3) { // Check if there are enough columns
                String bookName = cells.get(0).getText();
                String author = cells.get(1).getText();
                if (author.equals("Amit")) {
                    System.out.println(bookName);
                }
            }
        }
        
        // Find the sum of prices for all books
        int sum = 0;
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() >= 4) { // Check if there are enough columns
                String priceText = cells.get(3).getText().replace("$", "").trim();
                try {
                    int price = Integer.parseInt(priceText);
                    sum = sum + price; 
                } 
                catch (NumberFormatException e) {
                    System.out.println("Error parsing price: " + priceText);
                }
            }
        }
        System.out.println("Sum of all book prices: $" + sum);
        
        // Close the driver
        driver.quit();
    }
}
