package Reflection_Practice1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test1 {

	public static void main(String[] args) 
	{
		
		TestReflection1 tr1= new TestReflection1();
		Class clazz1= tr1.getClass();
		
		//Step1
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Step1 - Getting class name ");
		System.out.println("Class Name :"+" "+clazz1.getSimpleName());
		
		//Step2
		System.out.println("-----------------------------------------------------------------------------------");
		Constructor[]  cons= clazz1.getDeclaredConstructors();
		System.out.println("Step2 - Declared Constructors");
		System.out.println("No of Declared Constructors :"+ " "+ cons.length);
		for(Constructor con:cons)
			{
				System.out.println("Constructor name : "+ " "+ con.getName());
			}
		
		//step3
		System.out.println("-----------------------------------------------------------------------------------");
		Method[] ms= clazz1.getDeclaredMethods();
		System.out.println("Step3 - Declared methods,return types,Parameters");
		System.out.println("No of methods :"+" "+ms.length);
		for(Method m:ms)
			{
			System.out.println("-----------------------------------------------------------------------------------");
				System.out.println(m.getName()+" "+"Return type is :"+m.getGenericReturnType());
				
				//Step4
				
				Parameter[] params= m.getParameters();
				//System.out.println("step4 - parameters of the methods");
				for(Parameter p:params) 
					{
					
						System.out.println(m.getName()+" "+"Parameter :"+p.getName()+" "+p.getParameterizedType());
					}
			}

	}

}
