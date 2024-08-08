package day13;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class certificate_of_deposits {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		String file=  System.getProperty("user.dir") + "\\Testing_data\\certificate-of-deposit.xlsx";
		int rows=ExcelUtils.getRowCount(file, "Sheet1");
		//read
		for(int i=1;i<=5; i++)//row
		{
			String depositamnt=ExcelUtils.getCellData(file, "Sheet1", i,0);//deposit amount
			String months=ExcelUtils.getCellData(file, "Sheet1", i,1);//months
			String Interestrate=ExcelUtils.getCellData(file, "Sheet1", i,2);//interst rate
			String coump=ExcelUtils.getCellData(file, "Sheet1", i,3);//coumpounding
			String percentage=ExcelUtils.getCellData(file, "Sheet1", i,4);//percentage per annual
			String exp=ExcelUtils.getCellData(file, "Sheet1", i,5);//expected data
			driver.findElement(By.id("mat-input-0")).clear();
			driver.findElement(By.id("mat-input-0")).sendKeys(depositamnt);
			driver.findElement(By.id("mat-input-1")).clear();
			driver.findElement(By.id("mat-input-1")).sendKeys(months);
			driver.findElement(By.id("mat-input-2")).clear();
			driver.findElement(By.id("mat-input-2")).sendKeys(Interestrate);
			Thread.sleep(3000);
			
			Select compoundingDrp = new Select(driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Compounded Annually']")));
			compoundingDrp.selectByVisibleText(coump);  
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement runBtn = driver.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]/div"));
			js.executeScript("arguments[0].click()", runBtn);

			String actMValue = driver.findElement(By.xpath("//*[@id=\"cdAPY\"]")).getText();

			if (Double.parseDouble(exp_e)== Double.parseDouble(actMValue)) {
				System.out.println("Test passed");
				ExcelUtils.setCellData(file, "Sheet1", i, 7, "passed");
				ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
			} else {
				System.out.println("Test failed");
				ExcelUtils.setCellData(file, "Sheet1", i, 7, "failed");
				ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
			}
		}
	}
}