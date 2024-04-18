package inheritance;

class UpperMost
{	
	void add()
	{
		System.out.println("Add-Super Most");
	}
	void sub()
	{
		System.out.println("Sub-Super Most");
	}

}
class Upper extends UpperMost
{
	void mult()
	{
		System.out.println("Mult-Super Class");
	}
	void div()
	{
		System.out.println("Div-Super Class");
	}

}

public class MultiLevel1 extends Upper{
	void mod()
	{
		System.out.println("Mod-sub class");
	}

	public static void main(String[] args) 
	{
		MultiLevel1 m1 = new MultiLevel1();
		m1.add();
		m1.sub();
		m1.div();
		m1.mod();
		m1.mult();

	}

}
