package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMappComplex {

	public static void main(String[] args) {
		HashMap<String,List<String>> map1= new HashMap<String,List<String>>();
		
		List<String> listofmails= new ArrayList<String>();
		
		listofmails.add("suresh@gamil.com");
		listofmails.add("suresh1@gamil.com");
		listofmails.add("suresh2@gamil.com");
		listofmails.add("suresh3@gamil.com");
		listofmails.add("suresh4@gamil.com");
		listofmails.add("suresh@gamil.com");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(listofmails);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(listofmails.size());
		
		map1.put("Email", listofmails);
		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(map1);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(map1.size());
		System.out.println("--------------------------------------------l----------------------------------------------------------------");
		Set<String> keys= map1.keySet();
		for(String key:keys)
		{
			System.out.println(key+" "+map1.get(key));
		}
	}

}
