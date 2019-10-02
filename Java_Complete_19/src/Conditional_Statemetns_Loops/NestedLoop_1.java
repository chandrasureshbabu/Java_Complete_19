package Conditional_Statemetns_Loops;

public class NestedLoop_1 {

	public static void main(String[] args) {
		/*
			i -3
			
			j-4
			
			k-5
		
		
		
		
		*/
		int i=0;
		
		
		
		while(i<3)
		{
			for(int j=0;j<4;j++)
			{
				int k=0; // it is declared in the , inner loops should be independent of the out loop
				do 
				{
					System.out.println("i :  "+i  +" j  "+j   +"k  "+ k);
					k++;
				}while(k<5);
			}
			i++;
		}
		

	}

}
