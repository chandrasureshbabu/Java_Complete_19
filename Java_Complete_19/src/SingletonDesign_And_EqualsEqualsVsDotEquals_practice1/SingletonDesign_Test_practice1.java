package SingletonDesign_And_EqualsEqualsVsDotEquals_practice1;

public class SingletonDesign_Test_practice1 {
	
	public static void main(String[] args)
	{
		SingletonDesign_Practice1 s1= SingletonDesign_Practice1.getinstance();
		SingletonDesign_Practice1 s2= SingletonDesign_Practice1.getinstance();
		
		System.out.println(s1==s2);//true since singleton design has single object reference above 2 objects has single point of reference 
		
		
		
	}

}
