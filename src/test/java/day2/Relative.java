package day2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://automationbookstore.dev");
			
			WebElement self = driver.findElement(By.xpath("//li[@id='pid3']"));
			System.out.println(self.getText());
			
			WebElement below = driver.findElement(RelativeLocator.with(By.tagName("li")).below(self));
			System.out.println(below.getText());
			
			WebElement left = driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(self));
			System.out.println(left.getText());
			
			WebElement right = driver.findElement(RelativeLocator.with(By.tagName("li")).toRightOf(self));
			System.out.println(right.getText());
			
			System.out.println("///////////////////////////////////////////////////////");
			WebElement self1 = driver.findElement(By.xpath("//*[@id='pid7']"));
			System.out.println(self1.getText());
			
			WebElement above = driver.findElement(RelativeLocator.with(By.tagName("li")).above(self1));
			System.out.println(above.getText());
			
			driver.close();
	}
}
