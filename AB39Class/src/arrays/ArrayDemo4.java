package arrays;

public class ArrayDemo4 
{

	public static void main(String[] args) 
	{
		String name ="sana123";
		char c1[]= name.toCharArray();
		
		for(int i=0;i<=name.length()-1;i++)
		{
		boolean answer = Character.isAlphabetic(c1[i]);//here Character is a class
		//System.out.println(answer);
		}
	}

}
