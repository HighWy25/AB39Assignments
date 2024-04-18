package arrays;

import java.util.Arrays;

public class Class19thFeb {

	public static void main(String[] args) 
	{
		int age[] = new int[3];
		age[0]=90;
		age[1]=18;
		age[2]=43;
		age[2]=143;//this will update the previous value 
		//age[3]=43;//since we given length as only 3 throws exception ArrayIndexOutOfBoundException
		Arrays.sort(age);//sorting the age value
		for(int i=0;i<=2;i++)//instead of giving them individually we can give like this in a for loop
		{
			System.out.println(age[i]);
		}
		
//		System.out.println(age[0]);
//		System.out.println(age[1]);
//		System.out.println(age[2]);

	}

}
