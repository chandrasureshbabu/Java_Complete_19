package Reflections_pratice3;

public class Methods_for_Test {
	
	public Methods_for_Test() {
		System.out.println("cnstrctr");
	}
	
	public void method1()
	{
		System.out.println("method1");
	}
	public void method2(int a, int b)
	{
		System.out.println("method2 with int parameters");
	}
	
	public void method3(int a, String d, double e)
	{
		System.out.println("methhod 3 with int , double, String");
	}
	public int method4(int f) {
		return 4;
	}
	
	public double method5() {
		return 10.245;
	}
	
	public String method6() {
		return "name";
	}

}
