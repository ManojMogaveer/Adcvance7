package Generic_Utillity;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class ExcelUtillity {
//pull
	/**
	 * 
	 * @param sheetName
	 * @param ronum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */
	

		public String getExcelData(String sheetName, int ronum, int cellNum) throws Throwable {
			
			FileInputStream fes = new FileInputStream("./src/test/resources/AdvSelenium7to9am.xlsx");
			
			Workbook book = WorkbookFactory.create(fes);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(ronum);
		     Cell cell = row.getCell(cellNum);
		    String ExcelData = cell.getStringCellValue();
		    return ExcelData;
		}

	
}
