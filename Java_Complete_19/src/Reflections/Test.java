package Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test {

	public static void main(String[] args) {
		//**Step1
		/* // Getting Info about class 'TestReflections'
		TestReflections t= new TestReflections();
		//getsimpleName method gives name of the class
		//Getclass is method that returns Class obj of the java
		// Hence code writtne like below
		System.out.println("Class info :-"+ t.getClass().getSimpleName());*/
		
		TestReflections t= new TestReflections();
		
		Class clazz= t.getClass();
		
		System.out.println("Step1 : class Info :- " + clazz.getSimpleName());
		//getdeclaredmethods is a method that returns Methods[]
		Constructor[] cans= clazz.getDeclaredConstructors();
		System.out.println("Step 1.1 : constrcutor Info : " + cans.length);
		
		for(Constructor con:cans)
		{
			System.out.println("Step 1.1.1 : constrcutor name :- " + con.getName());
		}
		
		//System.out.println(clazz.getDeclaredMethods());
		//step2
		Method[]  arrayofmethods= clazz.getDeclaredMethods();
		System.out.println("Step2 : No of methods :"+ arrayofmethods.length);
		
		
		for(Method m:arrayofmethods)
		{
			//step3
			System.out.println("Step3 : method name "+m.getName() +" Return type :- "+m.getReturnType());
			
			Parameter[] params=m.getParameters();
			//step4 
			for(Parameter p:params) {
				System.out.println("step 4 : parameter name of  "+m.getName()+"--"+p.getName());
			}
			
		}
		
		

	}

}
