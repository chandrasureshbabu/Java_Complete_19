package Java_Predfined_Methods3_19;

public class MathClass {

	public static void main(String[] args) {
		
		
		double a= Math.random();
		System.out.println("Rondom No: "+a);
		//Math is class from java api, .random is predefined method of Math class in java
		// it returns double value
		
		double b= Math.random()*100;
		System.out.println("Rondom No: "+b);
		
		int i= (int)(Math.random()*10);
		System.out.println(i);

	}

}
