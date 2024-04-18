package staticmethod;

public class MultStaticMethodsAssignment {

	static void add()
	{
		int i = 100;
		int i1 = 200;
		int sum = i+i1;
		System.out.println(sum);
				
	}
	static void sub()
	{
		int i = 100;
		int i1 = 200;
		int sub = i-i1;
		System.out.println(sub);
	}
	static void mul()
	{
		int i = 100;
		int i1 = 200;
		int mult = i*i1;
		System.out.println(mult);
	}
	static void div()
	{
		int i = 100;
		int i1 = 200;
		int div = i%i1;
		System.out.println(div);
	}
	static void mod()
	{
		int i = 100;
		int i1 = 200;
		int mod = i/i1;
		System.out.println(mod);
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}

}
