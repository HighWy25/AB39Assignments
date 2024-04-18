package arrays;

import java.util.Arrays;

public class Class19thFeb1 {

	public static void main(String[] args) 
	{
		String name[]= new String[3];//max 3 index/values we can take else it will throw outofbound exception
		
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Lakshman";
		
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		//3 chairs at home
		//5 guests can sit on it? NO so here as well it will apply similar rule
		
		

	}

}
