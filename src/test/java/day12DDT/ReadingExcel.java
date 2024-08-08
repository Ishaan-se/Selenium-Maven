package day12DDT;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") +  "\\TestData\\Book1.xlsx");
		
//		FileInputStream file = new FileInputStream("C:\Users\ishaa\eclipse-workspace\selenium_maven_sdet\TestData\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file); // Apache POI
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // Name
		
//		XSSFSheet sheet = workbook.getSheetAt(0); // Index
		
		int rows = sheet.getLastRowNum(); // Row no.
		int col = sheet.getRow(1).getLastCellNum(); // Col no.
		
		System.out.println("Rows are: " + rows);
		System.out.println("Col are: " + col);
		
		for (int r=0;r<=rows;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
		
		for (int c=0;c<col;c++)
		{
//			XSSFCell cell_Value = currentRow.getCell(c);
//			String cell = cell_Value.toString();
			
			String cellValue = currentRow.getCell(c).toString();
			System.out.println(cellValue + "      ");
			
		}
			System.out.println();
		}
			workbook.close();
			file.close();
	}

}
