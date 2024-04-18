package stringpackage;

public class StringRev1 {

	public static void main(String[] args) 
	{		//String name = "Orange";
			String name = "Ravi Das";
			String reverse = "";
			
			for(int i=name.length()-1;i>=0;i--)
			{
				char answer = name.charAt(i);
				
				reverse = reverse+answer;
			}
		
			System.out.println(reverse);
	}

}
