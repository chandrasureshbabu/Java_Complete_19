package JavaMethods1234;

public class Test {

	public static void main(String[] args) {
		Variables vrs= new Variables();
		//local variables
		System.out.println(vrs.displayLocalvar()); // local variables 
		
		//instance vars
		//1st object
		//incrementing instance variable ;
		System.out.println(vrs.i++);
		System.out.println(vrs.i);
		
		//2nd object , is new copy of the class Test so it instance variable starts from where its got initialized value
		Variables vrs1= new Variables();
		System.out.println(vrs1.i);
		//Class 
		System.out.println(Variables.c);
		Variables.c++;
		System.out.println(vrs.c);
		System.out.println(vrs1.c);
		
		// Calq class
		
		System.out.println("*********************************calC**********");
		
		Calc c= new Calc();
		System.out.println(c.calAdd(10, 12));
		System.out.println(c.calSub(10, 11));
		System.out.println(c.calMulti(10, 20));
		System.out.println(c.calDiv(10, 5));

	}

}
