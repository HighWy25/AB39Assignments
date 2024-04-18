package typecasting;
class Teacher1
{
	void add()
	{
		System.out.println("Teacher");
	}
}
class Mentor1 extends Teacher1
{
	void sub()
	{
		System.out.println("Mentor");
	}
}
public class Student1 extends Mentor1{
	void mult()
	{
		System.out.println("Student");
	}
	
	public static void main(String[] args) 
	{
		Teacher1 t1 = new Student1();//upcasting from Teacher will only fetch that particular class
		t1.add();
		
		Student1 s1=(Student1) t1;//downcasting
		s1.mult();//once downcating is done you can able to access all the methods which you didnt while upcasting
		s1.sub();

	}

}
