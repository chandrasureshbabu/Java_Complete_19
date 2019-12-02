package ExcelFilesWriting;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_ExcelFile {

	public static void main(String[] args) throws IOException {
		//command to create xssf workbook
		XSSFWorkbook xf= new XSSFWorkbook();
		
		//create sheet in workbook
		XSSFSheet  sheet0= xf.createSheet("First Sheet");
		
		//Create row in sheet
		
		Row row0=sheet0.createRow(0);
		// create cell
		
		Cell cellA=row0.createCell(0);
		Cell cellb=row0.createCell(1);
		
		//set cell value
		
		cellA.setCellValue("first cell");
		cellb.setCellValue("2nd cell");
		
		// file streams
		
		File f= new File("C:\\Selenium Files\\Exel Files\\Writing  or Reading Excel files\\1stExcel.xlsx");
		FileOutputStream fo= new FileOutputStream(f);
		
		xf.write(fo);
		//close the Stream
		fo.close();
		
		System.out.println("Excel created");

	}

}
