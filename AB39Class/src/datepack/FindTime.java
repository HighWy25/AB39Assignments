package datepack;

import java.util.Date;

public class FindTime {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		Date d3 = new Date(d1.getTime() +(1000*60*60*24*1));//this will fetch future time of 1 day ahead
		System.out.println(d2);
		System.out.println(d3);
		
		//Month
		String a1= d2.toString();
		String month = a1.substring(4, 7);
		System.out.println(month);
		//Date
		String date= a1.substring(8, 10);
		System.out.println(date);
		//Year
		System.out.println(a1.length());//this will give whole length so it will be easy to find long results
		String year = a1.substring(24, 28);
		System.out.println(year);

		//date format--> DD MMM YYYY
		
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	}

}
