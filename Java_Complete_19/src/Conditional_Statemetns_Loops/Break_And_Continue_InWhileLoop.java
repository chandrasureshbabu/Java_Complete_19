package Conditional_Statemetns_Loops;

public class Break_And_Continue_InWhileLoop {

	public static void main(String[] args) {
		
		
		int i=0;
		int j=0;
		
		while(i<=10)
		{	
			i++;
			if(i==7)
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("************************************************************");
		do
		{
			j++;
			
			if(j>=7 && j<=8)
			{
				continue;
			}
			System.out.println(j);
			
		}while(j<10);

	}

}
