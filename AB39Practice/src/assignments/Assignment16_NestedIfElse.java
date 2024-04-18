package assignments;
/*
 * Write a program to check if gender equals to male or female.
 * If it is male and check if age is greater than 18 or not.
 * if it is greater than 18 then the person is eligible to vote 
 * otherwise not eligible to vote.If it is female and check 
 * if age is greater than 18 or not.If the age is greater than 18 
 * then the person is eligible to vote otherwise not eligible to vote 
 */
public class Assignment16_NestedIfElse {

	public static void main(String[] args) {
		
		String gender1 = "Male";
		String gender2 = "Female";
		int age = 18;
		
		if(gender1 == "Male")
		{
			if(age>=18)
			{
				System.out.println("Don't sell your VOTE");
			}
			else
			{
				System.out.println("Get older first");
			}
		}
		else
		{
			System.out.println("Choose the right condition");
		}
				
		
		
		

	}

}
