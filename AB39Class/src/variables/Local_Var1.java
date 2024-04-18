package variables;

public class Local_Var1 {
	static void add()
	{
		int a =100;
		int a1 = 200;
		System.out.println(a+a1);
	}
	void subtract()
	{
		int a =100;
		int a1 = 200;
		System.out.println(a-a1);
	}
	void subtract(int age, String name, char gender)
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(gender);
	}

	public static void main(String[] args) 
	{
		add();
		Local_Var1 l1 = new Local_Var1();
		l1.subtract();
		l1.subtract(21, null, 'M');
		
		

	}

}
