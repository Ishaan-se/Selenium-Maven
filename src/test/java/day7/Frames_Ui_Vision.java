package day7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Ui_Vision {
		public static void main(String[] args) throws InterruptedException {
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("ui.vision/demo/webtest/frames/");
	        
//				 Maximizes the Window
	     		driver.manage().window().maximize();
	     		
	     		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
	     		driver.switchTo().frame(frame1);
	     	    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello Frames ");
	            
	            Thread.sleep(3000);
	            
	            driver.switchTo().defaultContent();

	            driver.close();
	}

}
