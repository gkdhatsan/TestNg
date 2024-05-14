package aravind.project;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataInput {

	public static String[][] getSheet(String path, String sheetname) {

		String[][] data = null;

		try {

			FileInputStream fis = new FileInputStream(new File(path));
			HSSFWorkbook book = new HSSFWorkbook(fis);

			HSSFSheet sheet = book.getSheet(sheetname);
			int rowNum = sheet.getLastRowNum();

			int cellNum = sheet.getRow(0).getLastCellNum();

			data = new String[rowNum][cellNum];

			for (int i = 1; i < rowNum + 1; i++) {

				try {
					HSSFRow row = sheet.getRow(i);
					for (int j = 0; j < cellNum; j++) {
						try {
							String cellValue = "";
							try {
								String cellValue2 = row.getCell(j).getStringCellValue();
							} catch (NullPointerException e) {

							}
							data[i - 1][j] = cellValue;
						} catch (Exception e) {

							e.printStackTrace();
						}
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
			}

			book.close();
			fis.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return data;
		
	}

}
