package com.aravindDataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FuntionalLib {

	
public String GetDataFromWorkbook(int rowNum,int cellNum) throws IOException {
		
		String cellValue=null;
		
	File file = new File("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\test3.xlsx");
	FileInputStream input  = new FileInputStream (file);
	Workbook book = new XSSFWorkbook(input);
	Sheet sheet = book.getSheet("rose");
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	CellType cellType = cell.getCellType();
	
	switch (cellType) {
	case STRING:
		cellValue = cell.getStringCellValue(); 
		break;
		
	case NUMERIC:
		if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat simple = new SimpleDateFormat("DD/MM/YYYY");//month must be in caps
			cellValue = simple.format(dateCellValue);
			}
		
	        else {
			double numericCellValue = cell.getNumericCellValue();
			long lng = (long)numericCellValue;
			Long value = Long.valueOf(lng);
			cellValue= value.toString();
			}
	break;
	default:
		break;
	}
	return cellValue;	
}
		
}
