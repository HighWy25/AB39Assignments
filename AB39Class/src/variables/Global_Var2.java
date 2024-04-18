package variables;

public class Global_Var2
{
	static int num1 = 100;
	static int num2 = 30;
	
	static void add()
	{
		System.out.println(num1+num2);
	}
	static void sub()
	{
		System.out.println(num1-num2);
	}
	static void mul()
	{
		System.out.println(num1*num2);
	}
	static void div()
	{
		System.out.println(num1/num2);
	}
	static void mod()
	{
		System.out.println(num1%num2);
	}
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
		mod();

	}

}
