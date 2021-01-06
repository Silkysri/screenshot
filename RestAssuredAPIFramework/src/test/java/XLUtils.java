import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	
	
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow ro;
	public static XSSFCell cl;
	
	public static int getRowCount(String fl, String sheet) throws IOException
	{
		fi = new FileInputStream(fl);
		wb = new XSSFWorkbook(fi);
		sh=wb.getSheet(sheet);
		int rowcount = sh.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount(String fl, String sheet,int rownum) throws IOException
	{
		fi = new FileInputStream(fl);
		wb = new XSSFWorkbook(fi);
		sh=wb.getSheet(sheet);
		ro=sh.getRow(rownum);
		int cellcount = sh.getLastRowNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	public static String getCellData(String fl, String sheet,int rownum, int colnum) throws IOException
	{
		fi = new FileInputStream(fl);
		wb = new XSSFWorkbook(fi);
		sh=wb.getSheet(sheet);
		ro=sh.getRow(rownum);
		cl =ro.getCell(colnum);
		String data;
		try
		{
			DataFormatter df = new DataFormatter();
			String celldata = df.formatCellValue(cl);
			return celldata;
		}
		catch(Exception e)
		{
			data="";
		}
		
		wb.close();
		fi.close();
		return data;
	}
	
	public static void setCellData(String fl, String sheet,int rownum, int colnum, String data) throws IOException
	{
		fi = new FileInputStream(fl);
		wb = new XSSFWorkbook(fi);
		sh=wb.getSheet(sheet);
		ro=sh.getRow(rownum);
		
		cl=ro.createCell(colnum);
		cl.setCellValue(data);
		fo= new FileOutputStream(fl);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	
	
}
