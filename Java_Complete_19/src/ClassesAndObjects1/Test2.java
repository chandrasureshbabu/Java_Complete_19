package ClassesAndObjects1;

public class Test2 {

	public static void main(String[] args) {
		new Test2();// there is no reference object assigned to the new object so this object as well eligible for clean by Garbage cleaner in java heap 
		//Garbage cleaner backend automated process that will be handled by JVM
		
		
		Test2 t= new Test2();//Reference variable hold address of the object.
		System.out.println(t);
		
		t= null; //we assigned null reference . so this eligible to GC
		

	}

}
