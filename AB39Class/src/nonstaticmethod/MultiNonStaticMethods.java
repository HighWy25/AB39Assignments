package nonstaticmethod;

public class MultiNonStaticMethods 
{	
	void add()
	{
	int i = 100;
	int i1 = 200;
	System.out.println(i+i1);
	}

	public static void main(String[] args) 
	{
		MultiNonStaticMethods m1 = new MultiNonStaticMethods();
		m1.add();
		m1.sub();
		mult();
		m1.add();
		m1.add();
		m1.mult();
		m1.sub();

	}
	
	void sub()
	{
		int a = 10;
		int b = 29;
		System.out.println(a-b);
	}
	
	public static void mult()
	{
		int i = 10;
		int i2 = 100;
		System.out.println(i*i2);
	}

}