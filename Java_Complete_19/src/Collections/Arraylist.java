package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// List is interface, ArrayList is an class 
		
		//Defining Array list
		
		ArrayList list= new ArrayList();
		// adding values to the list.
		list.add(10); //value is beeing converted to object of the integer class.
		list.add("suresh");//value is beeing converted to object of the String class.
		list.add(true);//value is beeing converted to object of the boolean class.
		list.add('A');//value is beeing converted to object of the Char class.
		list.add(10);//adding duplicate value
		list.add(null);//null value can be added to the arraylist.
		list.add(0);
		
		System.out.println(list);// printing arraylist
		System.out.println(list.size());
		System.out.println("---------------------------------------");
		//array list preserve of order insertion , duplicates are allowed , null values are allowed.
		//to get specific object value from array list based on the index value , default index is '0' in arraylist as same as array.
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println("---------------------------------------");
		// removal of an object value from arraylist.
		list.remove(6);
		System.out.println(list);// printing arraylist
		System.out.println(" ---------------------------------------1st way");
		
		//System.out.println(list.get(6));// getting out bound error 
		//one way to print arraylist using for aloop based on index
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(" ---------------------------------------2nd way");
		// 2nd way s for each loop
		for(Object var:list) // object hold the all values as object values 
		{
			System.out.println(var);
		}
		System.out.println(" ---------------------------------------3rd way");
		
		Iterator itr=list.iterator(); //Iterator is interface that iterate throgh the arraylist
		
		while(itr.hasNext())//since it is not known how many object values are holding by object we are using while loop , hasnext method checks object values till the end 
		{
			System.out.println(itr.next());
		}
		
	}

}
