package nonstaticmethod;

public class NonStaticMethod {
	
	void add()
	{
		System.out.println("Non static");
	}

	public static void main(String[] args) {
		NonStaticMethod n1 = new NonStaticMethod();//creating obj for non static method
		n1.add();//calling non static method
		System.out.println("Main");

	}

	
	
	
	
}
