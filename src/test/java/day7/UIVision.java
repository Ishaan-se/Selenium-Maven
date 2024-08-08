package day7;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class UIVision {

			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://ui.vision/demo/webtest/frames/");	
				WebElement frame = driver.findElement(By.xpath("/html/frameset/frame[1]"));
				driver.switchTo().frame(frame);
				driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("1111");
				driver.switchTo().defaultContent();
				
				WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
				driver.switchTo().frame(frame3);
				driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[2]/div/span")).click();
				driver.switchTo().defaultContent();
				
				WebElement frame5 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
				driver.switchTo().frame(frame5);
				driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("55555");
				Thread.sleep(5000);
				driver.close();
				
			}

		}
