package staticmethod;

public class MultiStaticMethods {
static void firststatic()
{
	System.out.println("First Static Method");
}
static void secondstatic()
{
	System.out.println("Second Static Method");
}
	public static void main(String[] args) {
		System.out.println("Main Method");
		firststatic();
		secondstatic();
		thirdstatic();
	}
static void thirdstatic()
{
	System.out.println("Third Static Method");
}
}
