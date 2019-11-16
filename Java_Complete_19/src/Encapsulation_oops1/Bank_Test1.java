package Encapsulation_oops1;

public class Bank_Test1 {

	public static void main(String[] args) {
		Bank b= new Bank();
		b.amountWithdrawel(1234, 300000, 1234567890);
		b.pinChange(1234,1234567890,1235);
		//b.amountWithdrawel(1234, 300000, 1234567890);
		double balanceAmount=b.depositsamount(100000, 1234, 1234567890);
		System.out.println(balanceAmount);

	}

}
