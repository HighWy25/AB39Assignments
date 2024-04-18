package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) 
	{
		try {
			Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();//suppose first time I will enter 1, answer will be 
		int c = 1/a;//second time I will enter 0
		System.out.println(c);//third time I will enter name then it will throw inputmismatch exception
		}
		catch(ArithmeticException a1)
		{
			System.out.println("handle the exception please continue 1.....");
		}

		catch(InputMismatchException a2)
		{
			System.out.println("handle the exception please continue 2.....");
		}
	}

}
