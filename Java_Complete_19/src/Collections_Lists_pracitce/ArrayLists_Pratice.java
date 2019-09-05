package Collections_Lists_pracitce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists_Pratice {

	public static void main(String[] args) {
		List list= new ArrayList();
		list.add("Bmw");
		list.add(1);
		list.add(10.25);
		list.add('c');
		list.add(100000);
		
		System.out.println("---------------- list printing ---------------");
		System.out.println(list);
		System.out.println("---------------- getting value from list based on index since arraylist is ordered list ---------------");
		System.out.println(list.get(0));
		list.add("6th");
		System.out.println(list);
		System.out.println("------------removing from list");
		list.remove(5);
		System.out.println(list);
		
		System.out.println("----------------------------Printing using for loop--------------------------------");
	     for(int i=0;i<list.size();i++)
	     {
	    	 System.out.println(list.get(i));
	     }
		
	     System.out.println("----------------------------Printing using for each--------------------------------");
	     for(Object objs:list)
	     {
	    	 System.out.println(objs);
	     }
	     System.out.println("----------------------------Printing using Iterator--------------------------------");
	     Iterator itr= list.iterator();
	     
	     while (itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	     
	     System.out.println("----------------------------Printing specific value--------------------------------");
	     for(Object obj: list)
	     {
	    	 Object ob= obj;
	    	 if(ob.equals(1))
	    	 {
	    		 System.out.println(ob);
	    		 //System.out.println(ob+10); since collections stores  objects , so we cannot add directly to object, 
	    		 int i= (Integer)ob+11;//for that we need have TYpe casting
	    		 System.out.println(i);//this can saolved eby generics that allows only metioned type of data
	    	 }
	    	 
	     }
	}

}
