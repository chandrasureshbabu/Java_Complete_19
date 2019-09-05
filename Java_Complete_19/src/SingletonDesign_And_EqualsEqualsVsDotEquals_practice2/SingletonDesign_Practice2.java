package SingletonDesign_And_EqualsEqualsVsDotEquals_practice2;

public class SingletonDesign_Practice2 {

	private static SingletonDesign_Practice2 instance= new SingletonDesign_Practice2();
		
	    
		private SingletonDesign_Practice2()
		{
			System.out.println("Creating object");
		}
		
		public static SingletonDesign_Practice2 getinstance() {
			return instance;
		}

	

}
