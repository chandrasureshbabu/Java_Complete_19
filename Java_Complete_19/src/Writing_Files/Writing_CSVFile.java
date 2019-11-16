package Writing_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_CSVFile {

	public static void main(String[] args) throws IOException {
		
		
		File f= new File("C:\\Selenium_Files Writing\\MyFile1.csv");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("FirstName");
		bw.newLine();
		bw.write("Suresh");
		bw.newLine();
		bw.write("analyst");
		bw.newLine();
		
		bw.close();
		System.out.println("Csv  file Created");

	}

}
