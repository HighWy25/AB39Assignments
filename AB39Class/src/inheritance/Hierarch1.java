package inheritance;

public class Hierarch1 extends Hierarch2
{
	static void sub()
	{
		System.out.println("Sub Class Sub");
	}
public static void main(String[] args) 
{
	sub();
	mult();
	sub(13);
	Hierarch1 h1 = new Hierarch1();
	h1.add();
}
}
