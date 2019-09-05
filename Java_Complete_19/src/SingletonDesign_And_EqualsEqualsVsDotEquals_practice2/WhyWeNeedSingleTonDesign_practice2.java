package SingletonDesign_And_EqualsEqualsVsDotEquals_practice2;

public class WhyWeNeedSingleTonDesign_practice2 {

	public static void main(String[] args) {
		String s= "Chandra";
		String s1= "Chandra";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		String s2= new String("suresh");
		String s3= new String("suresh");
		System.out.println(s2==s3);// since above objects are pointing to their respective addresses
		
		
		
		
	}

}
