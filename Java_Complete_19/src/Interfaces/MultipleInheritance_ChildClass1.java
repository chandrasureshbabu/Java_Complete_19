package Interfaces;

public class MultipleInheritance_ChildClass1 implements MultipleInheritance_Interface_parent1, MultipleInheritance_Interface_parent2{

	public static void main(String[] args) {
		
		
		MultipleInheritance_ChildClass1 obj= new MultipleInheritance_ChildClass1();
				obj.show();
		
				
				//or
		MultipleInheritance_Interface_parent1 obj1= new MultipleInheritance_ChildClass1();
				obj1.show();		
				
				//or
		MultipleInheritance_Interface_parent2 obj2= new MultipleInheritance_ChildClass1();
						obj2.show();			

	}
	
	
  // child class overrides show method 
	@Override
	public void show() {
		System.out.println(" child class1");
		
	}

}
