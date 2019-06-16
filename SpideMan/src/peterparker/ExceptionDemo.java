package peterparker;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			int i;
			int j;
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value ");
			i=s.nextInt();
			j=s.nextInt();
			
			
			int m=i/j;
			
			System.out.println("Value is "+m);
		}
		catch(ArithmeticException e) 
		{
			System.err.println("Fuck that code  ERROR" +e);
		}
		finally
		{
			System.out.println(" FuckOff");
		}

	}

}
