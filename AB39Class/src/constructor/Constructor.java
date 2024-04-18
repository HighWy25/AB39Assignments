package constructor;

public class Constructor {
	Constructor()
	{
		System.out.println("This is my Constructor");
	}

	public static void main(String[] args) {
		Constructor c1 = new Constructor();//this is how to invoke a constructor
		new Constructor();//another way to invoke
		System.out.println("This is main method");
	}

}
