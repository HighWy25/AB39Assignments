package blocks;

public class Static_Block 
{	
	static //SIB this will execute first before main method as well
	{
		System.out.println("SIB");
	}
	{	//IIB
		System.out.println("IIB");
	}

	public static void main(String[] args) 
	{
		new Static_Block();//to invoke/call IIB need an object 
		System.out.println("Main Method");

	}

}
