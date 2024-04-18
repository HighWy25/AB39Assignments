package staticmethods;

public class MultiStaticMethods {
static void logout()
{
	System.out.println("Third Static Method as Logout");
}
	static void login()
{
	System.out.println("First Static Method as Login");
}
	public static void main(String[] args) {
		System.out.println("Go to the Url as Main Method");
		login();
		search();
		logout();

	}
	
	static void search()
	{
		System.out.println("Second Static Method as Search");
	}

}
