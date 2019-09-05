package Collections;

public class WrapperClasses {

	public static void main(String[] args) 
	{
		int var=10;
		Integer obj= new Integer(var); // wrapping values of the int primitive data type in to Integer class is called autoboxing.
		//this will be happened automatically when we use collections
		System.out.println(obj);
		
		int i= obj;
		System.out.println(obj);//unboxing/unwrapping.
		

	}

}
