package com.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class GetDataFromWorkbook_Aravind {

	public static String[][] getSheet() throws IOException {

		String data[][]  = null;
		FileInputStream fis = new FileInputStream(new File(
				"C:\\Users\\User\\eclipse-workspace\\DailySeleniumBasics\\src\\com\\basics\\facebook.aravind.xls"));
		//HSSFWorkbook book = new HSSFWorkbook(fis);
		Workbook book = new HSSFWorkbook(fis);
		//HSSFSheet sheet = book.getSheet("facebook");
		Sheet sheet = book.getSheet("facebook");
		int rowNum = sheet.getPhysicalNumberOfRows();
		int cellNum = sheet.getRow(0).getPhysicalNumberOfCells();
		data = new String[rowNum][cellNum];
		for (int i = 0; i < rowNum ; i++) {
			//HSSFRow row = sheet.getRow(i);
			Row row = sheet.getRow(i);
			for (int j = 0; j < cellNum; j++) {				
				String cellValue = row.getCell(j).getStringCellValue();
				data[i ][j] = cellValue;	
				}
			book.close();
		}

		return data;
	}

}
