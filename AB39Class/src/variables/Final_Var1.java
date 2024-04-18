package variables;

public class Final_Var1 
{
	final static double pi= 3.14;
		static void add()
		{
			final int a = 100;
			//a = 1000;//cant be updated once given as final
			System.out.println(a);
		}

	public static void main(String[] args) 
	{
		add();

	}

}
