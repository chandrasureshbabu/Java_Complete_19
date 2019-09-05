package SingletonDesign_And_EqualsEqualsVsDotEquals_practice1;

public class SingletonDesign_Practice1 {
	
	
	
	private SingletonDesign_Practice1() {
		System.out.println("creating private constructor");
	}// we cannot call this class/instance since constructor is private so we need  create a method returns instance of this class
	
	public static SingletonDesign_Practice1 getinstance(){
		 return instance;
	}
	
	//creating variable '' instance that has reference object of the class
	
	private static SingletonDesign_Practice1 instance= new SingletonDesign_Practice1();
	
	
}
