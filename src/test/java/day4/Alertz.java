package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertz {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	    // Maximizes the Window
        driver.manage().window().maximize();
        
        // PEHLA PAWADA
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(3000);
       Alert alert1= driver.switchTo().alert();
       alert1.accept();
      // alert.dismiss();
       
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
        
       // DUJA PAWADA
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
       Alert alert2= driver.switchTo().alert();
       alert2.accept();
      // alert.dismiss();
       
        
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
        
        // TEEJA PAWADA
        
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
       Alert alert3= driver.switchTo().alert();
       alert3.sendKeys("Bye");
       alert3.accept();
      // alert.dismiss();
        
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
        	
	}

}
