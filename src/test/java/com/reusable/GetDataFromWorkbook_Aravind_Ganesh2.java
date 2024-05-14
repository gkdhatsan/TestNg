package com.reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class GetDataFromWorkbook_Aravind_Ganesh2 {

	public static String[][] getSheet() throws IOException {

		String data[][]  = null;
		FileInputStream fis = new FileInputStream(new File(
				"C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\src\\test\\java\\com\\balaproject\\facebook.aravind.xls"));
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
System.out.println(data);
		return data;
	}

	public static String getDataFromWorkbook(String path, String sheetname) throws IOException {
		String result = null;
		FileInputStream fis = new FileInputStream(new File(path));
		Workbook book = new HSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetname);
		int lastRowNum = sheet.getLastRowNum();
		for (int i = 0; i < lastRowNum + 1; i++) {
			Row row = sheet.getRow(i);
			if (row != null) {
				int lastCellNum = row.getLastCellNum();
				for (int j = 0; j < lastCellNum + 1; j++) {
					Cell cell = row.getCell(j);
					if (cell != null) {
						CellType cellType = cell.getCellType();
						switch (cellType) {
						case STRING:
							result = cell.getStringCellValue();
							break;
						case NUMERIC:
							if (DateUtil.isCellDateFormatted(cell)) {
								Date dateCellValue = cell.getDateCellValue();
								SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
								result = sdf.format(dateCellValue);
							} else {
								double numericCellValue = cell.getNumericCellValue();
								BigDecimal big = new BigDecimal(numericCellValue);
								result = big.toString();
							}
							break;
						default:
							break;		}}}}}			
			System.out.println(result);				
		return result;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		GetDataFromWorkbook_Aravind_Ganesh2.getSheet();
		
	}
}


