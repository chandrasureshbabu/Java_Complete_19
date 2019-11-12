package Writing_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_TxtFile {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Selenium_Files Writing\\MyFile1.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("First line");
		bw.newLine();
		bw.write("chandra");
		bw.newLine();
		bw.write("analyst");
		bw.newLine();
		
		//close writer
		
		bw.close();
		
		System.out.println("file closed");
		
		//when we rerun the same file override to append the data
		

	}

}
