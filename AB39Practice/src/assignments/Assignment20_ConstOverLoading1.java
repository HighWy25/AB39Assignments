package assignments;
//write a program for constructor overloading using 10 constructors
public class Assignment20_ConstOverLoading1 {
	Assignment20_ConstOverLoading1()
	{
		System.out.println("Constructor1");
	}
	Assignment20_ConstOverLoading1(int a)
	{
		System.out.println("Constructor2");
	}
	Assignment20_ConstOverLoading1(int a, int b)
	{
		System.out.println("Constructor3");
	}
	Assignment20_ConstOverLoading1(int i, int i2, int f3)
	{
		System.out.println("Constructor4");
	}
	Assignment20_ConstOverLoading1(int l, int l1, int c4, int i5)
	{
		System.out.println("Constructor5");
	}
	public static void main(String[] args) 
	{
		new Assignment20_ConstOverLoading1();
		new Assignment20_ConstOverLoading1(126);
		new Assignment20_ConstOverLoading1(326,12);
		new Assignment20_ConstOverLoading1(2345,98765,54);
		new Assignment20_ConstOverLoading1(987654,23456,65476,89765);
		new Assignment20_ConstOverLoading1(432,321,456,980,432);
		new Assignment20_ConstOverLoading1(67,1,54,7863,2345,1232,4321);
		new Assignment20_ConstOverLoading1(67,1,54,7863,2345,1232,4321,454);
		new Assignment20_ConstOverLoading1(67,1,54,7863,2345,1232,4321,874,342);
		new Assignment20_ConstOverLoading1(67,1,54,7863,2345,1232,4321,874,342,421);

	}
	Assignment20_ConstOverLoading1(int i1,int i2,int i3,int i4,int i5)
	{
		System.out.println("Constructor6");
	}
	Assignment20_ConstOverLoading1(int i1,int i2,int i3,int i4,int i5,int i6,int i7)
	{
		System.out.println("Constructor7");
	}
	Assignment20_ConstOverLoading1(int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8)
	{
		System.out.println("Constructor8");
	}
	Assignment20_ConstOverLoading1(int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8, int i9)
	{
		System.out.println("Constructor9");
	}
	Assignment20_ConstOverLoading1(int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8, int i9,int i10)
	{
		System.out.println("Constructor10");
	}

}
