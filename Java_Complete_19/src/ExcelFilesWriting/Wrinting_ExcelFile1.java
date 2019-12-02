package ExcelFilesWriting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wrinting_ExcelFile1 {

	public static void main(String[] args) throws IOException {
		//command to create xssf workbook
		XSSFWorkbook workbook= new XSSFWorkbook();
		//command to create sheet
		XSSFSheet s1= workbook.createSheet("FirstSheet");
		//command to create ROW
		
		Row r0= s1.createRow(0);
		
		//command to create cell
		Cell c0=r0.createCell(0);
		Cell c1=r0.createCell(1);
		Cell c2=r0.createCell(2);
		//set values to cells
		c0.setCellValue("1st value");
		c1.setCellValue("2nd Vlaue");
		c2.setCellValue(10);
		
		//Streams
		
		File f= new File("C:\\Selenium Files\\Exel Files\\Writing  or Reading Excel files\\2ndExcelFile.xlsx");
		FileOutputStream fo= new FileOutputStream(f);
		workbook.write(fo);
		//close Streams
		fo.close();
		System.out.println("File Created");
		
	}

}
