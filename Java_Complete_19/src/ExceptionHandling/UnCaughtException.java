package ExceptionHandling;

public class UnCaughtException {

	public static void main(String[] args) throws Exception {
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
		salary[9]=01;
		
		System.out.println(salary.length);
		Thread.sleep(1000);
		
		throw new Exception("error occurred");

	}

}
