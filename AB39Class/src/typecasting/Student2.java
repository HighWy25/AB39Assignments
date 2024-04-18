package typecasting;
class Teacher2
{
	void add()
	{
		System.out.println("Teacher");
	}
}
class Mentor2 extends Teacher2
{
	void sub()
	{
		System.out.println("Mentor");
	}
}

class ExpStudent extends Mentor2
{
	void mult()
	{
		System.out.println("ExpStudent");
	}
	
}

public class Student2 extends ExpStudent {

	void div()
	{
		System.out.println("Student2");
	}
	public static void main(String[] args) 
	{
		Mentor2 m2 = new Student2();
		m2.add();
		m2.sub();
		
		Student2 s2=	(Student2) m2;//downcasting
		s2.div();//once downcating is done you can able to access all the methods which you didn't while upcasting
		s2.mult();
		
		

	}

}
