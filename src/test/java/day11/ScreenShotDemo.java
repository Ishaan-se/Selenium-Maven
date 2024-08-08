package day11;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {

			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
			//Capture Full Page Screenshot
			TakesScreenshot ts = driver;
					
					File src = ts.getScreenshotAs(OutputType.FILE);
					File trg = new File("I:\\BTES\\Selenium\\full.png");	
					Files.copy(src, trg);
					
				}

			}
