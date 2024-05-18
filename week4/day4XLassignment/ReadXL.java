package week4.day4XLassignment;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {

	public String[][] readData() throws IOException {

		XSSFWorkbook book=new XSSFWorkbook("./src/main/java/week4/day4/CreateLeadxl.xlsx");
		//to get sheet name
		XSSFSheet sheet=book.getSheet("sheet1");
		
		//to get physicalrow
		int physicalrow=sheet.getPhysicalNumberOfRows();
		System.out.println("Physical row: "+physicalrow);
		
		//to get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count: "+rowCount);

		//to get column count
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column count: "+colcount);

		String[][] data=new String[rowCount][colcount];
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < colcount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;

			}
			
			book.close();
			
		}
		return data;
	}
}