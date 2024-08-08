package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	        driver.manage().window().maximize();

	        WebElement capital = driver.findElement(By.xpath("//div[@id='box6']"));
	        //  Computers.click();
	          WebElement country = driver.findElement(By.xpath("//div[@id='box106']"));
	          
	          Actions act = new Actions(driver);
	          act.dragAndDrop(capital, country).perform();
	          
	          
	}

}
