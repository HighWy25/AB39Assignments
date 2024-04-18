package variables;

public class Local_Var2
{
	static void add()
	{
		int a = 12;//local var
		int b = 13;//local var
		System.out.println(a+b);
		
	}
	void substract(int a, double d)
	{
		double sum = a + d;
		System.out.println(sum);
	}
	

	public static void main(String[] args) 
	{
		int no1 = 100;//local var
		int no2 = 200;//local var
		int a = 1000;//local var
		String name = "Kishore";//local var
				name = "Sana";//updating the var name to sana
		System.out.println(name);

	}

}
