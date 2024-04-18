package stringpackage;

public class SubStringFunc1 
{

	public static void main(String[] args) 
	{
		String a="orange";
		String answer1=a.substring(1);
		System.out.println(answer1);
		
		String answer2=a.substring(1, 3);//end index will always gives 1 less than the given value
		System.out.println(answer2);
	}

}
