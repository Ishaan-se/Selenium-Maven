package day2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Axes {

	public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
//	FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
				
		List <WebElement> pre = driver.findElements(By.xpath("//input[@id='email']//preceding::*"));
		
		System.out.println("Preceding is " + pre.size());
		
		List <WebElement> fol = driver.findElements(By.xpath("//input[@id='email']//following::*"));
		
		System.out.println("Following is " + fol.size());
		
		System.out.println("/////////////////////// PRECEDING /////////////////////////////////");
		
		for ( WebElement i : pre)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("/////////////////////// FOLLOWING /////////////////////////////////");
		
		for ( WebElement j : fol)
		{
			System.out.println(j.getText());
		}
		
		driver.close();
	}

}
