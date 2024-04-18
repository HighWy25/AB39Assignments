package variables;

public class Global_Var 
{	static int age;//Global Var
	static double salary=786432.32;
	char gender = 'M';//declaration & initialization
	void add()
	{
		
	}
	static void subtract()
	{
		age =43;//calling the global var
		System.out.println(age);
		System.out.println(salary);
		
	}
	public static void main(String[] args) 
	{
		System.out.println(age);
		Global_Var g1= new Global_Var();
		g1.subtract();
		System.out.println(g1.gender);
	}

}
