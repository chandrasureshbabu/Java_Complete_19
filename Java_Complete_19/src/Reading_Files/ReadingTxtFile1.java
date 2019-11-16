package Reading_Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFile1 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\\\Selenium_Files Writing\\\\MyFile1.txt");
		FileReader fr= new FileReader(f);
		BufferedReader reader= new BufferedReader(fr);
		
		
		System.out.println(reader.readLine());// this will 1st only
		System.out.println(reader.readLine());// this will 2nd only
		
		
	}

}
