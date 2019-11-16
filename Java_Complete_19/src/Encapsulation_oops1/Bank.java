package Encapsulation_oops1;

public class Bank {
	
	public long acountNo= 1234567890;
	private int Pin=1234;// declaring pin, amount is private , both cannot be changed externally by using object 
	private double balanceAmount=200000;// so both private instance variables are not accessible directly 
	
	//wrapping data , methods in one single unit .
	// if method is dependent on any data member wrap them in single unit , instead of calling (data member ) directlyyy
	public void amountWithdrawel(int pin ,double amount, long accno)
	{
		if(pin==Pin && acountNo==accno)
		{
			
			
			if(amount<=balanceAmount)
			{
				balanceAmount=balanceAmount-amount;
			System.out.println("You have withdrawn :"+ amount);
			}else
			
				System.out.println("No sufficient funds in ur account...");
			
		}else
		{
			System.out.println("not valid accoutno /Pin ");
		}
		
	}
	public void pinChange(int oldpin, long accno, int newpin)// changing pin , this can be changed, only authorized customers who has existing pin....
	{
		if(Pin==oldpin && acountNo==accno)
		{
			this.Pin=newpin;
			System.out.println("your pin is successfully changed...");
		}
		else
			System.out.println("Please enter correct existing pin...");
	}
	
	public double depositsamount(double amount, int pin, long accno)
	{
		if( Pin==pin && acountNo==accno )
		{
			balanceAmount=balanceAmount+amount;
			System.out.println(" amount is addded to account...");
			return balanceAmount;
		}
		
		else
		{
			System.out.println("Deposit trans is not successfull...");
			return balanceAmount;
		}
	}
	
	
	
	

}
