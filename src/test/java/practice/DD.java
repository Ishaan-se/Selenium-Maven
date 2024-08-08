package practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DD {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.bing.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium webdriver");
		Thread.sleep(3000);
		searchBox.click();
		Thread.sleep(3000);
		// Now, we'll find the dropdown option and click on it
		WebElement dropdownOption = driver.findElement(By.xpath("//li[@query='selenium webdriver']]"));
		dropdownOption.click();
		Thread.sleep(3000);
		
		if (searchBox.getAttribute("value").equals("selenium webdriver")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		driver.quit();
	



}
}