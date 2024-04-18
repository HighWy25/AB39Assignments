package arrays;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) 
	{
		String name1= "chin";
		String name2= "diff";
		if(name1.length()!=name2.length())
		{
			System.out.println("Sorry the given two strings are not Anagram");
		}
		
		else
		{
			char n1[]=name1.toCharArray();
			char n2[]= name2.toCharArray();

			Arrays.sort(n1);
			Arrays.sort(n2);
			
			System.out.println(Arrays.toString(n1));
			System.out.println(Arrays.toString(n2));
			
			Arrays.equals(n1, n2);
		}
	}

}
