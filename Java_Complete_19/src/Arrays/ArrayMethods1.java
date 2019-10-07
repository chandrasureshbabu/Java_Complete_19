package Arrays;

public class ArrayMethods1 {

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
		//salary[9]=91;
		//since 10 index got nothing int array at 10 th index will have default value of the int type
		System.out.println("salary length :"+salary.length);
		for(int i=0;i<salary.length;i++)
		{
			System.out.println(salary[i]);
		}
		
		System.out.println("---------------------------------------");
		String[] month= {"jan","Feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};// we can declare like this also
		
		// we can dcalre array below way.
		String mnth[]= {"jan","Feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		
		System.out.println(month.length);
		
		for(int i=0;i<month.length;i++)
		{
			System.out.println(month[i]);
		}
		

	}

}
