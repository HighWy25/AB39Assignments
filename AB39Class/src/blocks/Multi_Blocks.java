package blocks;
//Order of excecution will be SIB,Main,IIB and Constructor
public class Multi_Blocks 
{	static
	{
	System.out.println("SIB");
	}
	Multi_Blocks()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main");
		new Multi_Blocks();

	}
	{
		System.out.println("IIB");
	}
}
