package typecasting;

class Parent_Class
{
	void add()
	{
		System.out.println("Parent_Class");
	}
}
public class UpCasting extends Parent_Class {
	
	void subject()
	{
		
	}

	public static void main(String[] args) 
	{
		Parent_Class p1= new UpCasting();//Upcasting
		p1.add();
		
		UpCasting u1= (UpCasting) p1;//only explicit way to downcast

	}

}
