import java.util.Scanner;
public class test
{
	public int[][] test_2d_arr_thing()
	{
		int[][] a = new int[5][5];
		for(int x = 0;x<5;x++)
		{
			for(int y = 0;y<5;y++)
				a[x][y] = (int)(Math.random()*100);
		}
		return a;
	}
	public static void main()
	{
		for(int i = 0; i<5; i++)
			
	}
	/*public void doIt()
	{
		a();
		b();
		c();
	}
	public int[][] test_2d_arr_thing()
	{
		return new int[5][5];
	}
	public void a()
	{
		System.out.println("FAIL");
	}
	public void b()
	{
		System.out.println("FAIL");
	}
	public void c()
	{
		System.out.println("FAIL");
	}
	public static void main(String[]args)
	{
		testINT a= new testc1();
		a.doIt();
		testINT b= new testc2();
		b.doIt();
		testINT c= new testc3();
		c.doIt();*/
		/*int[] arr1 = {0, 6, 0, 4, 0, 0, 2};
		int count = 0;
	for (int i = 0; i < arr1.length; i++)
	{
		if (arr1[i] != 0)
		{
		arr1[count] = arr1[i];
		count++;
		}
	}
	int[] arr2 = new int[count];
	for(int i = 0; i < count; i++)
		arr2[i] = arr1[i];
	for (int num : arr1)
		System.out.println(num);
		if (!(0>0)&&!(0*5 < 100)) 
			System.out.println("AAA");
		else
			System.out.println("BBB");
		
		double one = 1;
		double two = 2;
		testNum(one, two);
		//System.out.printf("This is a test %10.2f %10f", testNum(), (one+two));
		imps();
	}*/
	/*public static void testNum(double one, double two){
		System.out.printf("This is a test %10.2f %10f %10f %.2f\n", one, two, testRet(one, two), one-two);
	}
	public static double testRet(double one, double two)
	{
		return one + two;
	}*/
	/*public static void imps(){
		Scanner k = new Scanner(System.in);
		k.next();
		System.out.println("a");
		String a = k.nextLine();
		System.out.println("b");
		String b = k.nextLine();
		System.out.println("c");
		String c = k.nextLine();
		System.out.println("d");
		String d = k.nextLine();
		System.out.println(a+b+c+d);
	}*/
	/*public class classes
	{
		private int a,b,d,e,f,zzz;
		public classes()
		{
			a = 0;
			b = 0;
			d = 0;
			e = 0;
			f = 0;
			zzz = 0;
		}
		public classes (int a1, int b2, int d3)
		{
			a = a1;
			b = b2;
			d = d3;
		}
	}*/
	
}