package abstractpackage;
abstract class Third_Class
{
	abstract void thirdmethod();
	abstract void fourthmethod1();
	void add()//by creating an obj we can call this inside the main method
	{
		System.out.println("1");
	}
	static void sub()//this can be direct calling
	{
		System.out.println("2");
	}
}
abstract class Forth_Class
{
	abstract void fourthmethod2();
	abstract void fourthmethod3();
	static void add3()
	{
		System.out.println("3");
	}
	void sub4()
	{
		System.out.println("4");
	}
}
public class Second_Class 
{

}
