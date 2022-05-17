import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"ForTesting.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("The number of acive rows :: "+noOfRows);
		System.out.println("The number of columns:: "+noOfColumns);
		System.out.println("The sheet name is :: " + workbook.getSheetName(0));
		
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(1);
		
		System.out.println("The first cell data is :: "+ sheet.getRow(0).getCell(0));
		System.out.println("The second cell data is :: "+ cell);
		
	}

}
