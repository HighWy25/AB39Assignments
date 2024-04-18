package assignments;
//Write a program to execute if else block
public class Assignment10_IfElseIf {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		if(a>b)
		{
			System.out.println("If block");
		}
		else if(b<a)
		{
			System.out.println("else if 1");
		}
		else if(b==a)
		{
			System.out.println("else if 2");
		}
		else if(b!=a)
		{
			System.out.println("else if 3");
		}
		else if(b>a)
		{
			System.out.println("else if 4");
		}
		else
		{
			System.out.println("else block");
		}
	}

}
