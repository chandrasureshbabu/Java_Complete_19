package Collections_Lists_pracitce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists_Practice_Generics {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(2);// in arraylist we add duplicates
		System.out.println(list);
		
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
		
		Iterator<Integer> itr=list.iterator(); //Iterator is interface that iterate throgh the arraylist
		
		while(itr.hasNext())//since it is not known how many object values are holding by object we are using while loop , hasnext method checks object values till the end 
		{
			System.out.println(itr.next());
		}
	}

}
