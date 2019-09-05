package Collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapp {

	public static void main(String[] args) {
		HashMap<String ,String> map = new HashMap<String ,String>();//map usually holds key,value pair, used in getting from Excel/DB
		//inserting data in to the map
		map.put("Name", "suresh");
		map.put("Desig", "QA");
		map.put("location", "Hyd");
		map.put("country", "IND");
		//duplicate can be allowed but previous data is going to be override
		map.put("Name", "chandra");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(map);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(map.get("Name"));
		//printing/getting all values from map
		//first we need to get keys from map
		//String keys=map.keySet(); returns set of the 
		
		Set<String> keys= map.keySet();
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(keys.size());
		System.out.println("------------------------------------------------------------------------------------------------------------");
		for(String key:keys)
		{
			System.out.println(key+" ;"+map.get(key));//getting and value of the key
		}
		System.out.println("----------------------------------------s--------------------------------------------------------------------");
		for(String key1:keys)
		{
			String str=key1;
			
			if(str.equals("Name"))
			{
				System.out.println(key1+" :"+map.get(key1));
			}
			
		}
		
		

	}

}
