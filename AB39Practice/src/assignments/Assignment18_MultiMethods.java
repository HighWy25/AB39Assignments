package assignments;
//Write a program with 4 Static method and 4 Non-Static method
public class Assignment18_MultiMethods {
 static void one()
{
	 System.out.println("one");
}
 static void two()
 {
	 System.out.println("two");
 }
 void three()
 {
	 System.out.println("three");
 }
 void four()
 {
	 System.out.println("four");
 }
	public static void main(String[] args) {
		one();
		two();
		Assignment18_MultiMethods m = new Assignment18_MultiMethods();
		m.three();
		m.four();
		five();
		m.six();
		m.seven();
		eight();
	}
	static void five()
	{
		System.out.println("five");
	}
	void six()
	{
		System.out.println("six");
	}
	void seven()
	{
		System.out.println("seven");
	}
static void eight()
{
	System.out.println("eight");
}
}
