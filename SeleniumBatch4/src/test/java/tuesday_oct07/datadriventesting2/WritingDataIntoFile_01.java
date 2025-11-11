package tuesday_oct07.datadriventesting2;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoFile_01 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestDataFolder\\writedata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(); // creating a new workbook
		
		XSSFSheet sheet = workbook.createSheet("student details"); // create a new sheet 
		
		XSSFRow row1 = sheet.createRow(0); // creates 1st row
		
		    row1.createCell(0).setCellValue("Name");
		    row1.createCell(1).setCellValue("Designation");
		    row1.createCell(2).setCellValue("Experience");
		    
	   XSSFRow row2 = sheet.createRow(1); // creates a 2nd row
			
		    row2.createCell(0).setCellValue("Tathagatha");
		    row2.createCell(1).setCellValue("Tester");
		    row2.createCell(2).setCellValue(11);
		    
      XSSFRow row3 = sheet.createRow(2); // creates a 2nd row
			
		    row3.createCell(0).setCellValue("Siva");
		    row3.createCell(1).setCellValue("Tester");
		    row3.createCell(2).setCellValue(2);
		    
		    workbook.write(file);
		    workbook.close();
		    file.close();
		    
		    System.out.println("File successfully created");

	}

}
