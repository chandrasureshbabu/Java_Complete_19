package SingletonDesign_And_EqualsEqualsVsDotEquals_practice1;

public class WhyWeNeedSingleTonDesign_practice1 {

	public static void main(String[] args) 
	{
		
		String name1= "suresh";
		String name2= "suresh";
		System.out.println(name1==name2);//true ,== compares references of objects, but name1, name2  are not objects it returns true
		System.out.println(name1.equals(name2));//.equals compares  values 
		
		//creating objects
		String name_1= new String("chandra");
		String name_2= new String("chandra");
		System.out.println(name_1==name_2);//false ,== compares references of objects, but name1, name2  are not objects it returns false
		System.out.println(name_1.equals(name_2));//.equals compares  values 

	}
	
	

}
