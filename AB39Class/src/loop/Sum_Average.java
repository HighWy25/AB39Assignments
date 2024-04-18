package loop;

public class Sum_Average 
{

	public static void main(String[] args) 
	{	double sum =0;
		for(int i =1;i<=10;i++)
		{
			sum = sum+i;
		}
		System.out.println("Sum of 1-10 is:" +sum);
		double avg = sum/10;
		System.out.println("Avg of 1-10 is:" +avg);
	}

}
