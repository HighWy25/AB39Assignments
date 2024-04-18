package arrays;

public class ArrayDemo5 {

	public static void main(String[] args) 
	{
		String name = "mango";
		char []c1 = name.toCharArray();
		int Count_Of_Alpha = 0;
		int Count_Of_Num= 0;
		
		for(int i=0;i<=name.length()-1;i++)
		{
			boolean answer = Character.isAlphabetic(c1[i]);
			boolean answer1 = Character.isDigit(c1[i]);
			
		}

	}

}
