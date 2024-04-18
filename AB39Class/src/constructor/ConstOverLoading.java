package constructor;

public class ConstOverLoading {
	ConstOverLoading()
	{
		System.out.println("1");
	}
	ConstOverLoading(String T)
	{
		System.out.println("ildi");
	}
	ConstOverLoading(int a, int b, int c)
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
	
		new ConstOverLoading();
		new ConstOverLoading("Ildi");
		new ConstOverLoading(1,2,3);

	}

}
