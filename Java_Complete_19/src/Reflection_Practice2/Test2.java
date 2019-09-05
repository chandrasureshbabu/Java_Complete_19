package Reflection_Practice2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test2 {

	public static void main(String[] args) {
		
		TestReflection2 tr2= new TestReflection2();
		Class c2=tr2.getClass();
		System.out.println("------------------------------");
		//step1 getting class info 
		System.out.println(c2.getSimpleName());
		//step1.1 getting constructor info- getDeclaredconstructor returns 
		Constructor[] cons= c2.getDeclaredConstructors();
		
		System.out.println("------------------------------");
		System.out.println("Constructors-----"+cons.length);
		
		for(Constructor con:cons)
		{
			System.out.println("Constructor-----"+con.getName());
		}
		//step2 - methods in class
		
		//c2.getDeclaredMethods() returns method array
		Method[] ms=c2.getDeclaredMethods();
		System.out.println("------------------------------");
		System.out.println("methods-----"+ms.length);
		for(Method m:ms)
		{
			System.out.println("methodName , Returntypes------"+m.getName()+" , "+m.getReturnType());
			
			//step3 parameters of methods
			//m.getParameters() returns parameter array
			
			Parameter[] params= m.getParameters();
			System.out.println("Parameters------"+params.length);
			
			for(Parameter p:params)
			{
				System.out.println("ParameterName ,Type-----"+ p.getName() +"," +p.getParameterizedType());
			}
		}
		

	}

}
