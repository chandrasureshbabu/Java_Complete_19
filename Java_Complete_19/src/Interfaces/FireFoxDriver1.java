package Interfaces;

public class FireFoxDriver1 implements WebDriver1 {
	// very first concrete class that implements an interface that overrides of the methods of 
	// respective interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void click() {
		System.out.println("Click");
		
	}

	@Override
	public void Sendkeys() {
		System.out.println("SendKeys");
		
	}

}
