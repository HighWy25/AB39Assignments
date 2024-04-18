package abstractpackage;
abstract class Parent_Class //exposing this to to others
{
	abstract void add();//abstract method will always be non static
	abstract void sub();
	void multi()//concrete method
	{
		System.out.println("It is a logic which needs to be shared or exposing to another company");
	}
	
	static void mod()//concrete method
	{
		System.out.println("It is a logic which needs to be shared or exposing to another company");
	}
}	
public class Child_Class extends Parent_Class
{		
	void add()//real logic will be written inside the child class
	{
		System.out.println("Abstract, Real Logic");
	}
	public static void main(String[] args) 
	{
		Child_Class c1 = new Child_Class();
		c1.add();
		c1.sub();
		mod();
		c1.multi();
	}
	
	void sub()
	{
		System.out.println("Abstract, Real Logic");
		
	}
}
