package arrays;

public class Array_Avg {

	public static void main(String[] args) 
	{	int age[] = new int[5];
		age[0]=90;
		age[1]=18;
		age[2]=43;
		age[3]=143;
		age[4]=143;
		double SumOfNo=0;
		
//		double avg = age[0]+age[1]+age[2]+age[3]+age[4]/age.length;
//		
//		System.out.println(avg);
		
		for(int i=0;i<=4;i++)
		{
			SumOfNo=SumOfNo+age[i];
		}
		System.out.println("SumofNo's ->" +SumOfNo);
		double average=SumOfNo/age.length;
		System.out.println("Average is ->"+average);

	}

}
