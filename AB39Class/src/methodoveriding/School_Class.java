package methodoveriding;
class College_Class
{
	void bookstowrite()
	{
		System.out.println("writing to study");
	}
}
public class School_Class extends College_Class
{	
	void bookstowrite()
{		super.bookstowrite();//super keyword
		System.out.println("writing to top the class");
		

}
	public static void main(String[] args) 
	{
		School_Class s1 = new School_Class();
		s1.bookstowrite();
		//s1.bookstowrite();

	}

}
