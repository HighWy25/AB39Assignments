package staticmethods;

public class StaticMethod {
static void firstmethod()
{
	System.out.println("First Static Method");
}
	public static void main(String[] args) {
		System.out.println("Main Method");
		firstmethod();//unless you call this method in the main it wont print output in the firstmethod
		

	}

}
