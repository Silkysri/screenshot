

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;


public class XLUtilsoo {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	
	
	
	public static HSSFWorkbook wb;
	public static HSSFSheet sh;
	public static HSSFRow ro;
	public static HSSFCell cl;
	
	public static int getRowCount(String fl, String sheet) throws IOException
	{
		fi = new FileInputStream(fl);
		wb = new HSSFWorkbook(fi);
		
		sh=wb.getSheet(sheet);
		int rowcount = sh.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount(String fl, String sheet,int rownum) throws IOException
	{
		fi = new FileInputStream(fl);
		
		wb = new HSSFWorkbook(fi);
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
		wb = new HSSFWorkbook(fi);
		sh=wb.getSheet(sheet);
		ro=sh.getRow(rownum);
		cl =ro.getCell(colnum);
		String celldata;
		try
		{
			DataFormatter df = new DataFormatter();
			celldata = df.formatCellValue(cl);
			System.out.println(celldata);
			
			//String celldata = cl;
		}
		catch(Exception e)
		{
			celldata="";
		}
		
		wb.close();
		fi.close();
		return celldata;
		//return data;
	}
	
	public static void setCellData(String fl, String sheet,int rownum, int colnum, String data) throws IOException
	{
		fi = new FileInputStream(fl);
		wb = new HSSFWorkbook(fi);
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
