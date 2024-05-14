package com.balaproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class GetDataFromWorkbook_Bala {

	public static String getDataFromWorkbook() throws IOException {
		String result = null;
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\src\\test\\java\\com\\balaproject\\facebook.aravind.xls"));
		Workbook book = new HSSFWorkbook(fis);
		Sheet sheet = book.getSheet("facebook");
		int lastRowNum = sheet.getLastRowNum();
		for (int i = 0; i < lastRowNum +1; i++) {
			Row row = sheet.getRow(i);
			if (row != null) {
				int lastCellNum = row.getLastCellNum();
				for (int j = 0; j < lastCellNum +1; j++) {
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
		
		GetDataFromWorkbook_Bala.getDataFromWorkbook();
		
	}
}
