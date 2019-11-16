package Writing_Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrtingHtmlfiles {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Selenium_Files Writing\\htmlfile1.html");
		FileWriter fw= new FileWriter(f);
		BufferedWriter br= new BufferedWriter(fw); 
		
		br.write("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<title>Page Title</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h1>This is a Heading</h1>\r\n" + 
				"<p>This is a paragraph.</p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
		br.close();
		System.out.println("Html file created");
		

	}

}
