package day13;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citi_Bank {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Set up WebDriver and open the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");

        // Allow time for the page to load completely
        Thread.sleep(5000); 

        String file = System.getProperty("user.dir") + "\\TestData\\CITIBank.xlsx";
        int rows = ExcelUtils.getRowCount(file, "Sheet1"); // Number of rows

        // Read the data from Excel and perform tests
        for (int i = 1; i <= rows; i++) {
            String amount = ExcelUtils.getCellData(file, "Sheet1", i, 0);
            String length = ExcelUtils.getCellData(file, "Sheet1", i, 1);
            String interestRate = ExcelUtils.getCellData(file, "Sheet1", i, 2);
            String compound = ExcelUtils.getCellData(file, "Sheet1", i, 3);
            String expectedPercentage = ExcelUtils.getCellData(file, "Sheet1", i, 4);

            // Pass the data to the application
            WebElement amountField = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
            amountField.clear();
            amountField.sendKeys(amount);

            WebElement lengthField = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
            lengthField.clear();
            lengthField.sendKeys(length);

            WebElement rateField = driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
            rateField.clear();
            rateField.sendKeys(interestRate);

            // Allow time for the fields to process the input
            Thread.sleep(3000); // Adjust as needed

            // Select the compound option
            WebElement compoundDropdown = driver.findElement(By.xpath("//*[@id=\"lEcE7Em2UkSqUmHuYCEnK\"]/div/div/div/div/app-cd-calculator/div/div[1]/form/div/div[4]"));
            compoundDropdown.click();

            WebElement compoundOption = driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span"));
            compoundOption.click();

            // Calculate and get the result
            WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]"));
            calculateButton.click();

            // Allow time for the result to be displayed
            Thread.sleep(3000); // Adjust as needed

            WebElement actualPercentageElement = driver.findElement(By.xpath("//*[@id=\"cdAPY\"]"));
            String actualPercentageText = actualPercentageElement.getText();
            
            if(actualPercentageText.equals(expectedPercentage)) {
				System.out.println("Test passed");		// Printing on console
				ExcelUtils.setCellData(file, "Sheet1", i, 5, "Passed");		// Printing on sheet(excel file)
				ExcelUtils.fillGreenColor(file, "Sheet1", i, 5);
			}
			else {
				System.out.println("Test failed");
				ExcelUtils.setCellData(file, "Sheet1", i, 5, "Failed");
				ExcelUtils.fillRedColor(file, "Sheet1", i, 5);
			}


            // Allow time before the next iteration
            Thread.sleep(3000); 
        }

        // Close the browser
        driver.close();
    }
}
