package typecasting;

public class Primitive_Widening {

	public static void main(String[] args) 
	{
		double wt =52;//Widening-Implicit Way
		System.out.println(wt);
		
		//Widening can be done in 2 ways a)Implicit Way b) Explicit Way
		
		double weight = (double)90;//Widening explicit way
		System.out.println(weight);
		
		
		byte a1 =90;
		int a2 = a1;
		System.out.println(a2);
		
	
	}

}
