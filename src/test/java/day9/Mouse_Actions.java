package day9;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 
       WebElement Computers = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
     //  Computers.click();
       WebElement Desktop = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']"));
       
       Actions act = new Actions(driver);
//       act.moveToElement(Computers).moveToElement(Desktop).click().build().perform();
       act.moveToElement(Computers).moveToElement(Desktop).click().perform();
       Thread.sleep(3000);
       
       
	}

}
