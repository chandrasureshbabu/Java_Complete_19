package Writing_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_TxtFile1 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Selenium_Files Writing\\MyFile2.txt");
		
		// when this program is exceuted 2nd time , same file overridden but append values to the same File ....
        FileWriter fw= new FileWriter(f, true);
        BufferedWriter bw= new BufferedWriter(fw);
        
        
        // writing into file
        
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		int num=(int)(Math.random()*100);
        		bw.write(num+" \t");
        	}
        	bw.newLine();
        }
        bw.close();
        System.out.println("File is created");
	}

}

