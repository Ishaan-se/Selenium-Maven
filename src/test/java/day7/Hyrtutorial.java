package day7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Hyrtutorial {
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ishaan Sehgal ");
				Thread.sleep(3000);

				WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"frm1\"]")); 
				driver.switchTo().frame(frame1);
				
				WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));				
				Select select_dropwdown = new Select(dropdown);
				select_dropwdown.selectByVisibleText("- Java");
				driver.switchTo().defaultContent();
				
				WebElement frame2 = driver.findElement(By.xpath("//*[@id=\"frm2\"]")); 
				driver.switchTo().frame(frame2);
				driver.findElement(By.name("fName")).sendKeys("Ishaan");
				driver.findElement(By.name("lName")).sendKeys("Sehgal");
				driver.findElement(By.id("malerb")).click();
				driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
				driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ishaan@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
				driver.switchTo().defaultContent();

					driver.close();
			}

		}

