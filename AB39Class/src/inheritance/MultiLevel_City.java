package inheritance;

public class MultiLevel_City extends MultiLevel_State
{

	void multi()
	{
		System.out.println("Child Multi");
	}
	void div()
	{
		System.out.println("Child Div");
	}
public static void main(String[] args) 
{
	add();
	MultiLevel_City m1 = new MultiLevel_City();
	m1.div();
	m1.multi();
	m1.div(21);

	}
		
	}


