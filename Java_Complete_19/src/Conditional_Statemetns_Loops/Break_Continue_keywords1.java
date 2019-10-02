package Conditional_Statemetns_Loops;

public class Break_Continue_keywords1 {

	public static void main(String[] args) {
		
		
		for(int i=0;i<20;i++) 
		{
			
			
			if(i==7) 

				break;
				
			
			System.out.println(i);
			
		}
		
		
System.out.println("***********J*********");
		
		for(int j=0;j<20;j++)
		{
			
			if(j>=7 && j<=8) 
			{
			continue;
			}
			System.out.println(j);
		}
		

	}

}
