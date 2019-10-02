package Conditional_Statemetns_Loops;

public class IF_Else_1 {

	public static void main(String[] args) {
		
		
		int op=(int)(Math.random()*30);
		System.out.println("random no is :"+op);
		
		if(op>10)
		{
			System.out.println("random is greater than 10 :");
		}
		else 
			if(op >20)
			{
				System.out.println("random is greater than 20 :");
			}else if(op >5 && op<10)
			{
				System.out.println("random is b/w   10 and 5");
			}else
			{
				System.out.println("random is < 5");
			}
		

	}

}
