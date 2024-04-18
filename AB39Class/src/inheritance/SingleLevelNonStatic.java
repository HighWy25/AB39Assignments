package inheritance;
class Parent_Class1
{
	 void mult(int a, int b)
	{
		System.out.println(a*b);
	}
}
public class SingleLevelNonStatic extends Parent_Class1
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	 void sub(int a, int b)
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) 
	{
		SingleLevelNonStatic s1 = new SingleLevelNonStatic();
		s1.add(124,432);
		s1.sub(876,3245);
		s1.mult(987,324);

	}

}
