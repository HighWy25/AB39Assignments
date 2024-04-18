package typecasting;
class Teacher
{
	void add()
	{
		System.out.println("Teacher");
	}
}
class Mentor extends Teacher
{
	void sub()
	{
		System.out.println("Mentor");
	}
}
public class Student extends Mentor{
	void mult()
	{
		System.out.println("Student");
	}

	public static void main(String[] args) 
	{
				Mentor t1 =new Student();//upcasting from Mentor will only fetch that particular class and above
				t1.add();
				t1.sub();
				
				Student s1=(Student)t1;//downcasting
				s1.mult();//once downcating is done you can able to access all the methods which you didn't while upcasting
				

	}

}
