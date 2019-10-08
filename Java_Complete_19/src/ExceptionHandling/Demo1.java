package ExceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		Calc c= new Calc();
		System.out.println("Before Test");
		try {
			System.out.println("try block");
			int d=c.div(2, 0);
			System.out.println(d);
			/*int o=c.add(2, 1);
			System.out.println(o);
			*/
			
		}
		catch(Exception e)
		{
			System.out.println("Catch block");
			System.out.println("exception is :"+e.getMessage());
			e.printStackTrace();
			
		}

	}

}
