package arrays;

public class SpaceEx {

	public static void main(String[] args) 
	{
		String name = "Kishore Sana";
		char []c1 = name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			boolean answer = Character.isSpaceChar(c1[i]);
		
			if(answer == true)
			{
				System.out.println("There is a space in the given String" +  "The index of space is"  + i);
			}
		}
	//	boolean answer = Character.isSpaceChar(c1[7]);
	//	System.out.println(answer);

	}

}
