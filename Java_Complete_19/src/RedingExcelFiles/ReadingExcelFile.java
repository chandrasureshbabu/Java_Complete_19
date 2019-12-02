package RedingExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
;

public class ReadingExcelFile {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File f= new File("C:\\Selenium Files\\Exel Files\\Writing  or Reading Excel files\\1stExce2.xlsx");
		FileInputStream fi= new FileInputStream(f);
		
		//Connecting Workbook
		
		Workbook workbook=WorkbookFactory.create(fi);
		Sheet sheet0= workbook.getSheetAt(0);
		
		//getting row
		
		for(Row row:sheet0)
		{
			for(Cell cell:row)
				
			{
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank Cell"+"\t");
				}
				
			}
			System.out.println();
		}
		fi.close();

	}

}
