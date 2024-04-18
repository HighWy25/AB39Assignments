package logicaloperators;

public class LogicalOperatorOr {

	public static void main(String[] args)
	{
		int age = 19;
		char gender = 'M';
		if(age>21 || gender =='H')
		{
			System.out.println("If block will run if atleast one condition is true");
		}
		else
		{
			System.out.println("If both condition are false then it comes to else block");
		}
	}

}
