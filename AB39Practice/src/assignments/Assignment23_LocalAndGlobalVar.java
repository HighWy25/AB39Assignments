package assignments;
/*
 * Write a program for Declaration and Intilization 
 * for Local and Global Variables
 */

public class Assignment23_LocalAndGlobalVar 
{		int i = 32;
		int i1 = 43;
		
	static void add()
		{
			int i = 32;
			int i1 = 43;
			int sum = i1+i;
			System.out.println("Local:" + sum);
		}

	public static void main(String[] args) 
	{
		
		System.out.println("Global");
		add();
	}
}
