package wednesday.oct15.datadriventestingexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	// reading the total row count
	public static int getrowcount(String xlfile,String xlsheet) throws IOException
	{
		fi= new FileInputStream(xlfile); 
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
	    int rowcount = ws.getLastRowNum();// total row count
	    wb.close();
	    fi.close();
	    return rowcount;
		
	}
	
	//reading the total cell count
	public static int getcellcount(String xlfile,String xlsheet, int rownum) throws IOException 
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum(); // total cell count
		wb.close();
		fi.close();
		return cellcount;
		
	}
    // Reading the data
	public static String getcelldata(String xlfile,String xlsheet, int rownum , int cellnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell=row.getCell(cellnum);
		
		// handling exception
		String data;
		try {
			
			data = cell.toString(); //convert all the diff data formats into String
		}
		catch(Exception e)
		{
			data=""; // locate the cell value and returns empty if the cell doesnt have any value
		}
		
		wb.close();
		fi.close();
	    return data;
		
		
	}
	
	// writing the data
	public static void setcelldata(String xlfile,String xlsheet, int rownum , int cellnum, String data) throws IOException
	
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell=row.getCell(cellnum);
		
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillgreencolor(String xlfile,String xlsheet, int rownum , int cellnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell=row.getCell(cellnum);
		
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillredcolor(String xlfile,String xlsheet, int rownum , int cellnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell=row.getCell(cellnum);
		
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
}


