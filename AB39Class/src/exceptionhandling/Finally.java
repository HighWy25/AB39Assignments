package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		try
		{
		int number = s1.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Exception occured dont worry will handle");
		}
		
		finally
		{
			System.out.println(" you have reached finally");
		}
	}

}
