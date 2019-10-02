package Conditional_Statemetns_Loops;

public class ForLoop_1 {

	public static void main(String[] args) {
		//int j=0;
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("Out of i Loop");
		
		
		int j=0;
		
		for(;j<=10;) // for loop must 2 ;; in loop condition
		{
			System.out.println(j);
			j++;
		}
		System.out.println("Out of j Loop");

	}

}
