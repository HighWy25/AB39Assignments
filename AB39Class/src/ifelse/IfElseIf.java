package ifelse;

public class IfElseIf {

	public static void main(String[] args) 
	{
		int a =100;
		int b =200;
		
		if(a<b)//true in case of else-if no matter how many only the first true statement will print
		{
			System.out.println(1);
		}
		else if(a!=b)//true
		{
			System.out.println(2);
		}
		else if(a<=b)//true
		{
			System.out.println(3);
		}
		else
		{
			System.out.println("Else block");
		}
		

	}

}
