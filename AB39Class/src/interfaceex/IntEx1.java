package interfaceex;
interface One
{
	void add();//abstract methods
	void sub();
}

public class IntEx1 implements One
{
	void area()
	{
		System.out.println("concrete method1");
	}
	static void area1()
	{
		System.out.println("concrete method2");
	}
	public static void main(String[] args) 
	{
		IntEx1 i1=new IntEx1();
		i1.area();
		area1();

	}

	
	public void add() 
	{
		System.out.println("The real logic can be here");
		
	}

	
	public void sub() 
	{
		System.out.println("The real logic can be here");
		
	}

}
