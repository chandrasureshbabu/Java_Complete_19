package Reflections_pratice3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Reflections_Test {

	public static void main(String[] args) {
		
		Methods_for_Test mt= new Methods_for_Test();
		System.out.println("class name of the object above :"+ mt.getClass().getSimpleName() );
		//or else we can get name like this
		Class clazx= mt.getClass();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Step1 - Getting class name ");
		System.out.println(clazx.getSimpleName());
		
		System.out.println("----------------------------------constrctr------------------------------------------------");
		
		Constructor[] cons= clazx.getDeclaredConstructors();
		System.out.println("No of Constructors defined in that class : "+ cons.length);
		System.out.println("----------------------constructor name----------------------");
		for(Constructor con:cons) {
			
			System.out.println(con.getName());
			
		}
		System.out.println("----------------------No of methods ----------------------");
		Method[] ms= clazx.getDeclaredMethods();
		System.out.println("No of Constructors defined in that class : "+ ms.length);
		
		for(Method m:ms) {
			System.out.println("MethodName is  :  "+ m.getName());
			
			System.out.println("----------------------No of parameters each methods ----------------------");
			
			Parameter[] params=m.getParameters();
			for(Parameter p:params) {
			System.out.println("Paramerters of :"+m.getName()+" are   "+p.getName()+"  " +p.getParameterizedType());
			}
		}
		

	}

}
