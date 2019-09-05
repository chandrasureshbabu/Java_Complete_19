package Collections_Maps_Pratice;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class Maps_Practice {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer,String>();
		map.put(1, "BMW");
		map.put(2, "Audi");
		map.put(3, "Honda");
		map.put(4, "Hyundai");
		map.put(5, "VW");
		map.put(6, "BMW"); //In maps keys should nt be duplicated , but values can
		System.out.println(map);
		
		System.out.println("-----------------printing maps using for each -----------");
		
		Set<Integer> set= map.keySet();
		System.out.println("size of keyset "+set.size());
		
		for(Integer i:set) {
			System.out.println(map.get(i));
		}
		
		System.out.println("-----------------printing maps using for each -----------");
		for(Integer s:set) {
			if(map.get(s).equals("BMW")) {
				System.out.println(map.get(s));
			}
		}
	}

}
