package ExcelFilesWriting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wrinting_ExcelFile2 {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook wrbk= new XSSFWorkbook();
		XSSFSheet s1= wrbk.createSheet("1st Sheet");
		
		//creating rows 
		
		for(int rows =0; rows<=10;rows++)
		{
			Row row=s1.createRow(rows);
			//and colmuns 
			for(int cols=0;cols<=10;cols++)
			{
				Cell cell=row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		
		//Streaming .......
		File f= new File("C:\\Selenium Files\\Exel Files\\Writing  or Reading Excel files\\1stExce2.xlsx");
		//writing to File
		FileOutputStream fo= new FileOutputStream(f);
		wrbk.write(fo);
		
		//close stream
		fo.close();
		System.out.println("File Created");

	}

}
