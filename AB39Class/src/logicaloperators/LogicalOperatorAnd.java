package logicaloperators;

public class LogicalOperatorAnd {

	public static void main(String[] args)
	{
		
		int age = 19;
		int salary = 10000;
		
		if(age>18 && salary == 10000)
		{
			System.out.println("if only both condition true it comes to if block");
		}
		else
		{
			System.out.println("if any condition is false it will hit else block");
		}
	}

}
