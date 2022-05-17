import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {
	
	
	public String[][] getExcelData() throws IOException {
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Test.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		
		int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("Number of Rows :: "+noOfRows);
		System.out.println("Number of Columnts :: "+noOfColumns);
		
		String[][] testData = new String[noOfRows][noOfColumns];
		
		for(int rowIndex=0; rowIndex<noOfRows; rowIndex++) {
			XSSFRow row = sheet.getRow(rowIndex);
			for(int colIndex=0; colIndex<noOfColumns; colIndex++) {
				XSSFCell cell = row.getCell(colIndex);
				String cellValue = "";
				CellType cellType = cell.getCellType();
				switch(cellType) {
				case NUMERIC:
					int value = (int)cell.getNumericCellValue();
					cellValue = String.valueOf(value);
					break;
				case STRING:
					cellValue = cell.getStringCellValue();
					break;
				}
				testData[rowIndex][colIndex] = cellValue;
				System.out.print(testData[rowIndex][colIndex]+"\t");
			}
			System.out.println("");
			
		}
		
		return testData;
		
		
	}

}
