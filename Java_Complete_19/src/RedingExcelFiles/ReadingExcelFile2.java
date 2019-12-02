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

public class ReadingExcelFile2 {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File f= new File("C:\\Selenium Files\\Exel Files\\Writing  or Reading Excel files\\1stExce2.xlsx");
		FileInputStream fi= new FileInputStream(f);
		Workbook wkbk= WorkbookFactory.create(fi);
		
		//Get Sheet
		
		Sheet sht0= wkbk.getSheetAt(0);
		//get row
		
		Row row0= sht0.getRow(0);
		Cell cell=row0.getCell(0);
		System.out.println(cell);
		fi.close();

	}

}
