package inheritance;
class Parent_Class
{
	static void mult(int a, int b)
	{
		System.out.println(a*b);
	}
}
public class SingleLevel extends Parent_Class
{
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		add(124,432);
		sub(876,3245);
		mult(987,324);
		
	}

}
