package nestedifelse;
/*
 * I want to check if gender is male or female
 * if gender is male age >18 then eligible to vote
 * if gender is female age >18 then eligible to vote
 */
public class NestedIfElseAssignment 
{

	public static void main(String[] args) 
	{
		String gender1 = "male";
		String gender2 = "female";
		int age = 18;
		if(gender2 == "female")
		{
			if(age>=18)
			{
				System.out.println("Eligible to vote");
			}
			else
			{
			System.out.println("get older first");
			}
		}else
		{
			System.out.println("Give the right condition in If block");
		}
	}

}
