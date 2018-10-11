package firstPgm;

public class DataTypes {
	public static int a=45;
	public static int b=95;
	public static float c,d;
	public static double e,f;
	
	public static short h,i;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean g = true;
		long j = (long) 100.10000000;
		long k = (long) 111.11123354599998;
		
		long longanswer = j+k;
		add();
		difference();
		multiply();
		division();
		System.out.println("Longanswer is:" +longanswer);
		
		if (g=true)
		{
			System.out.println("I learnt Data Types");
		}
		
				
	}

	public static void add()
	{
		int add = a+b;
		System.out.println("Answer of Addition is:" +add);
				
	}
	
	public static void difference()
	{
		c=(float) 45.9;
		d=99.9f;
		float difference = d-c;
		System.out.println("Answer of subtraction is:" +difference);
	}
	
	public static void multiply()
	{
	e=99.99;
	f=199.100;
	double product = e*f;
	System.out.println("Answer of Multiplication is:" +product);
		
	}
	
	public static void division()
	{
	h=(short)12.12;
	i=(short)244456.12;
	short quotient = (short) (i/h);
	System.out.println("Answer of division is:" +quotient);
				
	}
	
	
}

