package stringpackage;

public class StringRev2 {
	
	public static void main(String[] args) 
	{		//String name = "radar";
		String name = "India";
			String reverse = "";
			
			for(int i=name.length()-1;i>=0;i--)
			{
				char answer = name.charAt(i);
				
				reverse = reverse+answer;
			}
			boolean a1 = name .equals(reverse);
			System.out.println(a1);
			
			
			if(a1==true)
			{
				System.out.println("It is Palindrome");
			}
			else
			{
				System.out.println("Not a palindrome");
			}
	}


}
