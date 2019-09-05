package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsset {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		
		//Set wont allow duplicate values , so it can we used when unique values need to stored , like when we are working with window handles
		set.add("Selenium");
		set.add("Webdriver");
		set.add("2");
		set.add("Year");
		set.add("2019");
		// set is unordered , will not preserve insertion order. so get() values based index is unapplicable
		System.out.println(set);
		
		// printing values of the set
		System.out.println("--------------------------------------1st way-");
		for(String str:set)// since we declared String in generics we can directly call String Class object
		{
			System.out.println(str);
		}
		//or using object we can print values of the set
		
		System.out.println("--------------------------------------1.1 way-");
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		
		//if we want any specific value to Print 
		System.out.println("--------------------------------------Sepecific value using for each -");
		for(String str1:set)
		{
			String s=str1;
			if(s.equals("2"))
			{
				System.out.println(s);
			}
		}
		System.out.println("--------------------------------------2nd way-");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------------Sepecific value Iterator -");
		
		Iterator<String> itr1= set.iterator();
		while(itr1.hasNext())
		{
			String s1=itr1.next();
			if(s1.equals("Selenium"))
			{
				System.out.println(s1);
			}
		}
	}

}
