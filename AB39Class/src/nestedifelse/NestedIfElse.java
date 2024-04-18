package nestedifelse;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		int a = 100;
		int b = 200;
		int c = 300;
		String gender1 = "Male";
		String gender2 = "Female";
		String gender3= "Custom";
		
		if(c>b)
		{
			if(a<c)
			{
				if(b<c)
				{
					System.out.println("if block 1");
				}
				else
				{
					
				}
			}
			else
			{
				System.out.println("Else block 2");
			}
			
		}else
		{
			System.out.println("Else block 3");
		}
		
		
	}

}
