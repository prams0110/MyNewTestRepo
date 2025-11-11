package monday_sep29.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromFile_01 {

	public static void main(String[] args) throws IOException {
	
		// Read the data from the Excel file abc.xlsx
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestDataFolder\\abc.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		int totalrows = sheet.getLastRowNum(); // gives you the total rows in the whole sheet1
		
		int totalcells = sheet.getRow(1).getLastCellNum(); // total number of cells in the particular row
		
		System.out.println("total number of rows are : "+ totalrows); // 5 -- this is becoz the rows are read in the index form from the selenium
		System.out.println("total number of cells in row 1  are : "+ totalcells); // 4 - it is read in the normal from

		for(int i=0;i<=totalrows;i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int j=0;j<totalcells;j++) // do not read the cell count as the selenium has read with non index way
			{
				XSSFCell currentcell = currentrow.getCell(j);
				System.out.print(currentcell.toString()+"\t"); // converting any type of data into the string
			}
			
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
