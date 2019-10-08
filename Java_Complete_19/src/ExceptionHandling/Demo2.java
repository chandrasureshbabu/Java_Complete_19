package ExceptionHandling;

public class Demo2 {

	public static void main(String[] args) {
int[] salary = new int[10];// declaring int array
		
		
		salary[0]=1;
		salary[1]=21;
		salary[2]=31;
		salary[3]=41;
		salary[4]=51;
		salary[5]=61;
		salary[6]=71;
		salary[7]=81;
		salary[8]=01;
		
		try {
			salary[10]=10;
		}
		catch(Exception e)
		{	//run time exception
			System.out.println("Exception is  :"+e.getCause());
			e.printStackTrace();
		}

	}

}
