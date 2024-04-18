package blocks;

public class Multi_Sib 
{
		static
		{
			System.out.println("SIB1");
		}
		static
		{
			System.out.println("SIB2");
		}

	public static void main(String[] args) 
	{
		System.out.println("Main");

	}
	static
	{
		System.out.println("SIB3");//though its given after main method 
								//it will execute earlier than main 
	}

}
