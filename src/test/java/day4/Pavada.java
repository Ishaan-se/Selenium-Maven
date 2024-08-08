package day4;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pavada {

	public static void main(String[] args) throws InterruptedException {
			
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
		    // Maximizes the Window
	        driver.manage().window().maximize();
	        //Locate all Checkboxes
	       List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	       System.out.println("Selected ");
	       
	       // Scroll to the checkboxes using sendKeys method
	        checkboxes.get(0).sendKeys(Keys.PAGE_DOWN);
	       
	       //    First 3 elements 
	       for (int i=0; i<3;i++)
		       {
		    	   checkboxes.get(i).click();
		       }
	       
	       
	       for (WebElement i:checkboxes )
	       {
	    	   System.out.println(i.isSelected());
	       }
	       System.out.println("Unselected");
	       
	       
//	       for (int i=0; i<3;i++)
//	       {
//	    	   checkbox.get(i).click();
//	       }
	       // USING IF CONDITION 
	       for (int i=0;i<checkboxes.size();i++)
	       {
	    	   if (checkboxes.get(i).isSelected())
	    	   {
	    		   checkboxes.get(i).click();   
	    	   }		   
	       }    
       for (WebElement i:checkboxes )
       {
    	   System.out.println(i.isSelected());
       }
	              
	       driver.close();

	}

}
