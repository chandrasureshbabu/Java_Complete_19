package SingletonDesign_And_EqualsEqualsVsDotEquals;

public class WhyWeNeedSingleTonDesign {

	public static void main(String[] args) 
	{
		//why we need single single ton deisgn this below example shows 
		
		String name1= "suresh";
		String name2= "suresh";
		//the above strings types holds same values
		
		System.out.println(name1==name2); //true
		System.out.println(name1.equals(name2)); //true
		
		String name_1=new String("suresh");
		String name_2=new String("suresh");
		// the above are objects holding references that are different with different address
		
		System.out.println(name_1==name_2);//false -since now this Name_1,name_2 are not holding any values but holding objects 
		//objects with different referneces , address so it is returning false
		//== used to compare the references 
		//.equals used to comapre values
		System.out.println(name_1.equals(name_2));//true
		
		
		
		
		
		

	}

}
