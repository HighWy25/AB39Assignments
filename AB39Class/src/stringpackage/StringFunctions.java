package stringpackage;

public class StringFunctions 
{

	public static void main(String[] args) 
	{
		String name = "Orange";
		boolean answer = name.endsWith("e");
		System.out.println(answer);
		
		String answer1 = name.replace('g', 'T');
		System.out.println(answer1);
		
		String n1 = "orange fruit";
		String answer2= n1.replaceAll("fruit", "and banana");
		System.out.println(answer2);
		
		
		String name1="world no1";
		
		System.out.println(name1.replaceAll("[0-9]", ""));
		
		System.out.println(name1.replaceAll("[a-z]", ""));
		
		String name2 ="sana lokanath KISHORE";
		System.out.println(name2.replaceAll("[a-z]", ""));
		System.out.println(name2.replaceAll("[A-Z]", ""));
		
		System.out.println(name2.isEmpty());
		String m2="";
		System.out.println(m2.isEmpty());
		
		
		System.out.println(name1.equals(name));
		System.out.println("Kishore".equals("kishore"));
		System.out.println("Kishore".equals("Kishore"));

	}

}
