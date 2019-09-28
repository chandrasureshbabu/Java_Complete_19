package ClassesAndObjects1;

public class Test1 {
	static Test1 t; //reference variable to the class

	public static void main(String[] args) {
		
		
		System.out.println(t);// prints null , since it is not pointing to  the any object . so it is eligible to garbage collection.
		// garbage collection is mechanism to clean java heap, so that new objects can be created.
		//heap stores objects of the classes .
		

	}

}
