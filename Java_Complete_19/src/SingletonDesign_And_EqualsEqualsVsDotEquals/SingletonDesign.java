package SingletonDesign_And_EqualsEqualsVsDotEquals;

public class SingletonDesign 
{

	//single ton design must have private constructor
	
	private   SingletonDesign() {
		
		System.out.println("creating private constructor");
		
	}
	//need to create a method that returns instance 
	
	public static  SingletonDesign getsIntance() 
	{
		//this method returns class instance
		return instance;// this is class variable 'instance '
	}
	
	private static SingletonDesign instance = new SingletonDesign();// this is class variable 'instance' holding reference  of the class 
	

}
