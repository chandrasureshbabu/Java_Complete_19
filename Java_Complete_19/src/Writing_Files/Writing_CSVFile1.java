package Writing_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writing_CSVFile1 {

	public static void main(String[] args) {
		File f= new File("C:\\Selenium_Files Writing\\MyFile2.csv");
		try {
		FileWriter fw= new FileWriter(f);// we want append the 2nd execution results to the same file.
		BufferedWriter bw= new BufferedWriter(fw);
		for(int i=0 ;i<4;i++)
		{
			for(int j=0; j<3;j++)
			{
				int num=(int)(Math.random()*100);
				System.out.println(num+" ");
				bw.write(num +" ,");
			}
			bw.newLine();
			
			
		}
		bw.close();
		System.out.println("Csv closed");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		

	}

}
