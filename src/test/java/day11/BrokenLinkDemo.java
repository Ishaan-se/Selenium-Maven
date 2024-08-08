package day11;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {

	public static void main(String[] args) throws IOException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.deadlinkcity.com/");
			driver.manage().window().maximize();
			
			// Total no of links 
			List <WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("The total no of links are "  + links.size());
			int brokenlinks = 0;
			for (WebElement i : links)
			{
				String hrefValue = i.getAttribute("href");
				
				if (hrefValue==null || hrefValue.isEmpty())
				{
					System.out.println("href value is Empty ");
					continue;
				}
				//CONNECTION -- OPEN,SEND
				
				//Convert string to URL 
				@SuppressWarnings("deprecation")
				URL linkurl = new URL(hrefValue); 
				HttpsURLConnection conn = (HttpsURLConnection) linkurl.openConnection();
				conn.connect();
				if (conn.getResponseCode()>400)
				{
					System.out.println(hrefValue + " " + "Broken link");
					brokenlinks++;
				}
				else 
				{
					System.out.println(hrefValue + " " + "Broken link");
				}	
			}
			
			System.out.println(brokenlinks);

	}

}

