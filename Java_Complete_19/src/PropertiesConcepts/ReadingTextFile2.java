package PropertiesConcepts;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingTextFile2 {

	public static void main(String[] args) {
Properties prop= new Properties();
		
		try {
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\PropertiesFiles_Concept\\File1.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.print(e +"file not found");
		}
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("age"));
			System.out.println(prop.getProperty("Desig"));
			System.out.println(prop.getProperty("salary"));

	}

}
