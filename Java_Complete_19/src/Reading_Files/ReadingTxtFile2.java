package Reading_Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFile2 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\\\Selenium_Files Writing\\\\MyFile1.txt");
		FileReader fr= new FileReader(f);
		BufferedReader reader= new BufferedReader(fr);
		
		
		String line=null;
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}

	}

}
