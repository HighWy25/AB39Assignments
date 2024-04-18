package assignments;
import java.util.Scanner;
//create 5 methods for addition , subtraction , multiplication ,
//divison , modulus using scanner class
public class Assignment27_ScannerMethods 
{	
	static int s1;
	static int s2;
	
	static void add()
	{
		System.out.println(s1+s2);
	}
	static void sub()
	{
		System.out.println(s1-s2);
	}
	static void mult()
	{
		System.out.println(s1*s2);
	}
	static void div()
	{
		System.out.println(s1/s2);
	}
	static void mod()
	{
		System.out.println(s1%s2);
	}

	public static void main(String[] args) 
	{	System.out.println("Input two numbers");
		Scanner s3 = new Scanner(System.in);
		s1 = s3.nextInt();
		s2 = s3.nextInt();
		
		add();
		sub();
		mult();
		div();
		mod();
	
	}

}
