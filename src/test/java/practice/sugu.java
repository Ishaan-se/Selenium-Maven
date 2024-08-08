package practice;
import java.time.Duration;
import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class sugu {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		int rowsCount = rows.size();
		System.out.println("Total Number of Rows- " + rowsCount);//find total number of rows in Web Table
		List<WebElement>col =driver.findElements(By.xpath("//tbody/tr/th"));
		int columnscount=col.size();
		System.out.println("Total Number of Columns are- " + columnscount);//find total number of column in Web Table
		System.out.println();

	    
	    	    
	    List<WebElement> rows1 = table.findElements(By.xpath(".//tbody/tr"));
	    
	    for (WebElement row : rows1) {
	     List<WebElement> cols = row.findElements(By.xpath(".//td"));
	     for (WebElement col1 : cols) {
	      System.out.print(col1.getText() + " ");
	     }
	     System.out.println();
	    }

	    // Get data at specific row and column
	    String cellData = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[3]")).getText();
	    System.out.println("Data at row 2 and column 3: " + cellData);

	    // Get books by author
	    for (WebElement row : rows1) {
	     String author = row.findElement(By.xpath(".//td[2]")).getText();
	     if (author.equalsIgnoreCase("Amit")) {
	      String bookName = row.findElement(By.xpath(".//td[1]")).getText();
	      System.out.println("Book by Amit: " + bookName);
	     }
	    }

	    // Calculate total sum of prices
	    double totalSum = 0;
	    for (WebElement row : rows1) {
	     String price = row.findElement(By.xpath(".//td[4]")).getText().replace("$", "");
	     totalSum += Double.parseDouble(price);
	    }
	    System.out.println("Total sum of prices for all the books: $" + totalSum);
	   }
	}