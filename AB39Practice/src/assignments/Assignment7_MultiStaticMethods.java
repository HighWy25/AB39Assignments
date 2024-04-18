package assignments;
/*
 * Create a class and write 5 static methods 
 * each for addition, subtration, multiplication, 
 * division and modules, #call it in the main method
 */
public class Assignment7_MultiStaticMethods {
static void add()
{
	System.out.println("Addition");
}
static void sub()
{
	System.out.println("Substraction");
}
public static void main(String[] args) 
{
		add();
		sub();
		mult();
		div();
	}

	static void mult()
	{
		System.out.println("Multiplication");
	}
	static void div()
	{
		System.out.println("Division");
	}
}

