package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_with_Generics {

	public static void main(String[] args) {
		
		//when we declare arraylist with generics , we can insert any object type value like String object,Interger object .
		
		/*ArrayList list= new ArrayList();
		
		list.add(10); // object value is integer type
		list.add("suresh");// object value is string type.
		list.add(true);// object value is boolean type
		list.add('A');// object value is char type
		list.add(10);// object value is integer type
		list.add(null);// object value is null
		list.add(0);// object value is integer type
		
	    System.out.println(list.get(0));
	    Object  var= list.get(0);
	    //System.out.println(var+20);// since it var object type value we cannot add anything.
	    int var1 = (Integer)list.get(0);//we need to type cast 
	    System.out.println(var1+20);*/
	    // to avoid above  type of situations we are using generics 
	    
		List<Integer> list= new ArrayList<Integer>();
		list.add(10);
		//list.add(10.89);//we cannot add to list other integer class object value.
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("-----------------------------------------");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("----------------------------------------1st way-");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------------------2nd way-");
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		//or System.out.println("----------------------------------------2.1nd way-");
		for(Integer i:list)//since in Generics we have declared integer , so the list holding integer values only
		{
			System.out.println(i);
		}
		System.out.println("----------------------------------------3rd way-");
		Iterator itr=list.listIterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
