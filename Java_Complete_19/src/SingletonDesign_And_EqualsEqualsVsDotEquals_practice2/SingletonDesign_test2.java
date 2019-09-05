package SingletonDesign_And_EqualsEqualsVsDotEquals_practice2;

public class SingletonDesign_test2 {

	public static void main(String[] args) {
		SingletonDesign_Practice2 s1= SingletonDesign_Practice2.getinstance();
		SingletonDesign_Practice2 s2=SingletonDesign_Practice2.getinstance();
		
		System.out.println(s1==s2);

	}

}
