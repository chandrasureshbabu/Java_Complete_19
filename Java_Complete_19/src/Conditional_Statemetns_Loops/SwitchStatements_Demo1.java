package Conditional_Statemetns_Loops;

public class SwitchStatements_Demo1 {

	public static void main(String[] args) {
		
		int days= Noofdays(2001,2);
		System.out.println(days);
		

	}
	
	
	public static int Noofdays(int year, int month)
	{
		int days=0;
		switch(month)
		{
		case 1:
			days=31;
			break;
		case 2:
			if(year%400==0)
			{
				days=29;
				
			}else
			{
				days=28;
			}
			break;
			
		case 3:
			days=31;
			break;
		case 4:
			days=30;
			break;
		case 5:
			days=31;
			break;
		case 6:
			days=30;
			break;
		case 7:
			days=31;
			break;
		case 8:
			days=31;
			break;
		case 9:
			days=30;
			break;
		case 10:
			days=31;
			break;
		case 11:
			days=30;
			break;
		case 12:
			days=31;
			break;
			
		default:
			System.out.println("Invalid month");
		}
		return days;
	}

}
