package stringpackage;

public class String_Contains {

	public static void main(String[] args) 
	{
		String s1 = "sana kishore";
		boolean a1 =s1.contains("sana");
		System.out.println(a1);
		
		String s2 = "orange";
		boolean a2=	s2.matches("o.....");//single char search
		System.out.println(a2);
		
		boolean a3=	s1.matches("(.*)e");//multi char search string ending with letter
		System.out.println(a3);
		
		boolean a4=s1.matches("s(.*)");//string starting with s
		System.out.println(a4);
		
		
		String name = "ram";
			boolean a5=	name.matches("...");//finding the length 
			System.out.println(a5);
	}

}
