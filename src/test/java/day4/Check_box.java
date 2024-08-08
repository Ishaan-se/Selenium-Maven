package day4;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_box {

public static void main(String[] args) {
			
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
		    // Maximizes the Window
	        driver.manage().window().maximize();
	        
	       List <WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	       System.out.println("Selected ");
	       for (WebElement i:checkbox )
	       {
	    	   i.click();
	       }
	       
	       for (WebElement i:checkbox )
	       {
	    	   System.out.println(i.isSelected());
	       }
	       System.out.println("UnSelected ");
	       for (WebElement i:checkbox )
	       {
	    	   i.click();
	       }

	       
	       for (WebElement i:checkbox )
	       {
	    	   System.out.println(i.isSelected());
	       }
	            
	       driver.close();        

	}

}

// Traversing list
//for (int i=0; i<checkbox.size();i++)
//{
//	   checkbox.get(i).click();
//}
//First 3 elements 
//for (int i=0; i<3;i++)
//    {
// 	   checkbox.get(i).click();
//    }
    
//Last 3 elements 
//for (int i=4; i<checkbox.size();i++)
//{
//	   checkbox.get(i).click();
//}
