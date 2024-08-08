package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Bootstrap {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

	    // Maximizes the Window
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		List <WebElement> output =driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li"));
//		System.out.println(output.size());
//		
//		for (WebElement i : output)
//		{
//			System.out.println(i.getText());
//		}
		List <WebElement> print =driver.findElements(By.xpath("//*[@class='checkbox']"));
		System.out.println(print.size());
		Thread.sleep(3000);
		
		for (WebElement i : print)
		{
			System.out.println(i.getText());
		}
		
		 for (WebElement i : print) {
	            String label = print.getText().trim();
	            if (label.equals("Java") || label.equals("MySQL")) {
	                print.findElement(By.tagName("input")).click();
	                
		driver.close();
		
		
	}
  }
 }
}
