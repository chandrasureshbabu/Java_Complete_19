package Interfaces;

public class MultipleInheritance_ChildClass2 extends MultipleInheritance_ParentClass1 implements MultipleInheritance_Interface_parent1, MultipleInheritance_Interface_parent2 { 

	
// extends has to be first before the implements of the any interfaces	
	public static void main(String[] args) {
		
		
		MultipleInheritance_ChildClass2 obj= new MultipleInheritance_ChildClass2();
		obj.show();

		
		//or
MultipleInheritance_Interface_parent1 obj1= new MultipleInheritance_ChildClass2();
		obj1.show();		
		
		//or
MultipleInheritance_Interface_parent2 obj2= new MultipleInheritance_ChildClass2();
				obj2.show();	

	}

}
