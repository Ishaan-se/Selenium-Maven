package day5;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

	    // Maximizes the Window
		driver.manage().window().maximize();

//		 Scroll down using sendKeys to the body
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000); // Adding a small delay to ensure the page is scrolled
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='country']"));
		drop.click();
		
		Select dropdown = new Select(drop);
//		// Select by Visible Text
		dropdown.selectByVisibleText("Germany");
		Thread.sleep(3000);
//		// Select by Value 
		dropdown.selectByValue("uk");
		Thread.sleep(5000);
//		 Select by Index
		dropdown.selectByIndex(4); // FRANCE
		Thread.sleep(3000);
		
		List <WebElement> kitne_aadmi_the = driver.findElements(By.xpath("//select[@id='country']/option"));
		System.out.println("Size of the list : " + kitne_aadmi_the.size());
		
		System.out.println(" Country List ");
//		 for (WebElement i:kitne_aadmi_the )
//	       {
//	    	   System.out.println(i.getText());
//	       }
		
		 for (int i=0; i<kitne_aadmi_the.size();i++)
		 {
			 System.out.println(kitne_aadmi_the.get(i).getText());
		 }
		driver.close();
	}
}
