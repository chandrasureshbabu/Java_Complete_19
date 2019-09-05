package Reflection_Practice1;

public class TestReflection1 {
	//Step1 
		//in 'Test' is getting this class info(name of the class)
		//step1.1 - declaring constructor
		
		TestReflection1()
		{
			System.out.println("declaring object");
		}
		
		// step2 declaring methods in this 
		// getting methods info in the 'test' class
		
		public  void method1()
		{
			System.out.println("This is method1");
		}
		
		public void  method2(int a, int b)
		{
			System.out.println("this is method2");
		}
		public int method3(int c, int d, int e)
		{
			return c+d+e;
		}
		public int method4()
		{
			return 4;
		}
		
		public double method5()
		{
			return 10.25;
		}
		
		public String method6()
		{
			return "6th method";
		}


}
