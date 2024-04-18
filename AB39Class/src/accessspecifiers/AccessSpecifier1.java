package accessspecifiers;

public class AccessSpecifier1 
{	
	public static void add()
	{
		System.out.println("Public");
	}
	protected void sub()
	{
		System.out.println("Protected");
	}
	private static void mult()
	{
		System.out.println("Private");
	}
	void div()
	{
		System.out.println("Default");
	}

	public static void main(String[] args) 
	{
		add();
		mult();
		AccessSpecifier1 a1= new AccessSpecifier1();
		a1.sub();
		a1.div();
		
	}

}
