package assignments;
//How to call non-static method inside a main method
public class Assignment15_NonStaticMethod {
	void one()
	{
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) 
	{
		Assignment15_NonStaticMethod a1 = new Assignment15_NonStaticMethod();
		a1.one();

	}

}
