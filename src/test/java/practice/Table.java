package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	
	  // Find the table element
    WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
    
    // Find all rows in the table (excluding header row)
    List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
    int rowsCount = rows.size();
    System.out.println("Total number of rows: " + rowsCount);
	

	List<WebElement>col =driver.findElements(By.xpath("//tbody/tr/th"));
	int colcount=col.size();
	System.out.println("Total number of cols are " + colcount);//find rows in page
	

}
}

//List<WebElement> specific =driver.findElements(By.xpath("//body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]"));
//int specificcount = specific.size();
//System.out.println(specific);

