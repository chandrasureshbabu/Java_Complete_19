package Collections_Sets_pracitce;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets_pracitce {

	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		set.add("BMW");
		set.add("Audi");
		set.add("Honda");
		set.add("Hyundai");
		set.add("WV");
		set.add("Audi");// set doesnt allow duplicate values 
		System.out.println(set);//sets doesnt maintain insertion order , so no point of index here
		
		System.out.println("--------------------------------------1st way-");
		for(String str:set) {
			System.out.println(str);
		}
		System.out.println("--------------------------------------2nd way-");
		
		Iterator<String> itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
			
		}
		System.out.println("--------------------------------------sepcifc value from set-");
		Iterator<String> itr1= set.iterator();
		while(itr1.hasNext())
		{
			//System.out.println(itr1.next());
			
			String str=itr1.next();
			if(str.equals("Honda"))
			{
				System.out.println(str);
			}
		}
		System.out.println("--------------------------------------sepcifc value from set using for each-");
		
		for(String str2:set) {
			if(str2.equals("Audi")) {
				System.out.println(str2);
			}
		}

	}

}
