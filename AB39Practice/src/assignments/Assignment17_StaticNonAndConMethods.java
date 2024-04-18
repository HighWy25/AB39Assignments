package assignments;
/*
 * Write a program with 2 Static method,
 * 2 Non-Static method,and one Constructor
 */
public class Assignment17_StaticNonAndConMethods {
	Assignment17_StaticNonAndConMethods()
	{
		System.out.println("Constructor");
	}
	void three()
	 {
		 System.out.println("three");
	 }
	 void four()
	 {
		 System.out.println("four");
	 }
	public static void main(String[] args)
	{
		one();
		two();
		new Assignment17_StaticNonAndConMethods();
		Assignment17_StaticNonAndConMethods a1 = new Assignment17_StaticNonAndConMethods();
		a1.three();
		a1.four();

	}
	static void one()
	{
		 System.out.println("one");
	}
	 static void two()
	 {
		 System.out.println("two");
	 }
}
