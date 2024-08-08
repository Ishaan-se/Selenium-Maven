package day12DDT;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") +  "\\TestData\\Book2.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(); // Apache POI
		
		XSSFSheet sheet = workbook.createSheet("Sheet1"); // Name
		
		// WITHOUT LOOP
		
	/*	XSSFRow row1 = sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("1234");
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1);
		
		row2.createCell(0).setCellValue("Hello");
		row2.createCell(1).setCellValue("6789");
		row2.createCell(2).setCellValue("Manual"); */
		
		// WITH LOOP
		
		Scanner sc = new Scanner(System.in);
		
		for (int r=0;r<3;r++)
		{
			XSSFRow currentRow = sheet.createRow(r); 
		
			for (int c=0;c<2;c++)
			{
				System.out.println("Enter the value of cell: ");
				
				String data = sc.next();
				currentRow.createCell(c).setCellValue(data);
				
			}
			
		}
		
		// Printing Values 
		
		for (int a=0;a<3;a++)
		{
			XSSFRow currentRow = sheet.getRow(a);
		
		for (int b=0;b<2;b++)
		{
			
			String cellValue = currentRow.getCell(b).toString();
			System.out.println(cellValue + "      ");
			
		}
			System.out.println();
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
	}

}
