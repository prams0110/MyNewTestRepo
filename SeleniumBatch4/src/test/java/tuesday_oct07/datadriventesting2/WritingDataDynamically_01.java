package tuesday_oct07.datadriventesting2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataDynamically_01 {

	public static void main(String[] args) throws IOException {
	
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestDataFolder\\Dynamicdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(); // creating a new workbook
		
		XSSFSheet sheet = workbook.createSheet("Datasheet1"); // create a new sheet 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int noOfrows = sc.nextInt();
		
		System.out.println("Enter the number of cells : ");
		int noOfcells = sc.nextInt();
		
		for(int r=0;r<noOfrows;r++)
		{
			XSSFRow rows = sheet.createRow(r);
			
			for(int c=0;c<noOfcells;c++)
			{
				XSSFCell cells = rows.createCell(c);
				cells.setCellValue(sc.next());
				
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		sc.close();
		
		System.out.println("File created successfully");
		
		
	}

}
