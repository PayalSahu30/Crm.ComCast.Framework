package com.comcast.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
 public String getDataFromExcel(String sheetname, int rownum,int cellnum) throws Throwable
 {
	 FileInputStream fis =new FileInputStream("./testData/TS_PracticeData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data =wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		wb.close();
		return data;
 }
 
 public int getRowCount(String Sheetname) throws Throwable
 {
	 FileInputStream fis =new FileInputStream("./testData/TS_PracticeData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		int rowCount=wb.getSheet(Sheetname).getLastRowNum();
		//wb.close();
		return rowCount;
 }
 
 public void setDataIntoExcel(String sheetname, int rownum,int cellnum,String data) throws Throwable
 {
	 FileInputStream fis =new FileInputStream("./testData/TS_PracticeData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rownum).createCell(cellnum);
		
		FileOutputStream fos=new FileOutputStream("./testData/TS_PracticeData.xlsx");
		wb.write(fos);
		wb.close();
	 
 }
 
}
