package assignments;
//Write a program for NOT with AND and NOT with OR operator
public class Assignment14_NotAndOr {

	public static void main(String[] args) {
		int a = 100;
		int b = 101;
		if(!(a>b || b>a))
		{
			System.out.println("If Block");
		}
		else
		{
			System.out.println("Else Block");
		}

	}

}
