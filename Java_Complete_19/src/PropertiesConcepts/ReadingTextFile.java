package PropertiesConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("E:\\Oxygen_Git_Repos\\Java_Complete_19\\src\\PropertiesFiles_Concept\\File1.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("desig"));
		System.out.println(prop.getProperty("salary"));
		
		
		System.out.println(System.getProperty("user.dir"));

	}

}
