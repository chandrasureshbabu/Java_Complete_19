package SingletonDesign_And_EqualsEqualsVsDotEquals;

public class SingletonDesign_Test {

	public static void main(String[] args) 
	{
		//creating objects for 'SingletonDesign' class
		SingletonDesign s1= SingletonDesign.getsIntance();
		SingletonDesign s2= SingletonDesign.getsIntance();
		// two objects pointing the same reference in singleton design , that is reason we need to single ton 
		
		// now we can use '==' to compare the referances , since 2 objects pointing same reference , then it returns true
		
		System.out.println(s1==s2);

	}

}
