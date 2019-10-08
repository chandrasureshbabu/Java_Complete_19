package ExceptionHandling;

public class CoughtExceptions {

	public static void main(String[] args) throws InterruptedException // this is caught exception
	{
		//throws is the keyword that throws exception
		
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
		//we cannot put every time try catch blocks for every time and every thing
		salary[10]=10;
		salary[11]=10;
		Thread.sleep(1000);
		salary[12]=10;
		salary[13]=10;
		Thread.sleep(10000);
		salary[14]=10;

	}

}
