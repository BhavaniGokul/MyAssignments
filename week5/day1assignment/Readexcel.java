package week5.day1assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public String[][] readdata() throws IOException {
		XSSFWorkbook book1=new XSSFWorkbook("./src/main/java/week5/day1assignment/Readxlw3.xlsx");
		//to get sheet name
		XSSFSheet sheet=book1.getSheet("sheet1");

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
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colcount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
						
			}
			book1.close();
		}
	return data;
	}
	

}
