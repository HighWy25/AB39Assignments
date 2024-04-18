package exceptionhandling;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) 
	{
		//Scanner s1 = new Scanner(System.in);//by taking scanner class in Array
		//int a = s1.nextInt();
		int age[]=new int[3];
		age[0]=12;
		age[1]=15;
		age[2]=90;
		try
		{
		age[3]=5;
	
		}
		catch (ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("check the size of an Array and try again");
		}
		
		System.out.println("We are into Exception Handling");
	}

}
