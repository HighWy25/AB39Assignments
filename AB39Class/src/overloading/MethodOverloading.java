package overloading;

public class MethodOverloading 
{
	static void add()
	{
		System.out.println("Method1");
	}
	static void add(int a, double d)
	{
		System.out.println("Method2");
	}
	static void add(int a)
	{
		System.out.println("Method3");
	}
	static void add(float f, int t,String s )
	{
		System.out.println("Method4");
	}
	public static void main(String[] args) 
	{
		add();
		add(10,10);
		add();
		add(100);
		add(4.53f,200,"Apple");

	}

}
