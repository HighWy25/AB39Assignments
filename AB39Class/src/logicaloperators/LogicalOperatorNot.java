package logicaloperators;

public class LogicalOperatorNot {

	public static void main(String[] args) 
	{
		int age = 19;
		int salary = 15000;
		
		/*
		 * if (!(age>19 || salary >9000))//though the condition is true but since its
		 * not operator it will reverse the result { System.out.println("if block"); }
		 * else { System.out.println("else block"); }
		 */
		
		if(!(age<10 && salary ==2000))//not operator will reverse the condition
		{
			System.out.println("if block");
		}
		else
		{
			System.out.println("else block");
		}
	}

}
