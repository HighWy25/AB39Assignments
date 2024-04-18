package interfaceex;
interface One1
{
	void add();
	void sub();
}
interface Two extends One1
{
	void mod();
	void mult();
}
public class IntEx2 implements Two
{
	void circle()
	{
		System.out.println("circle");
	}
	static void rect()
	{
		System.out.println("rect");
	}
	public static void main(String[] args) 
	{
		IntEx2 i1 = new IntEx2();
		i1.add();
		i1.sub();
		i1.mod();
		i1.mult();
		rect();

	}
	
	public void add() 
	{
		
		System.out.println("add");
	}
	
	public void sub() 
	{
		System.out.println("sub");
		
	}
	
	public void mod() 
	{
		
		System.out.println("mod");
	}
	
	public void mult() 
	{
		System.out.println("mult");
		
	}

}
