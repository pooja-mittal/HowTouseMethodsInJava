import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("enter your choice");
		int n=scr.nextInt();
		System.out.println("enter two numbers");
		double a=scr.nextDouble();
		double b=scr.nextDouble();
		double res;
		
		switch(n) {
			case 1: res=add(a,b);
					break;
			case 2: res=sub(a,b);
					break;	
			case 3: res=mul(a,b);
					break;
			case 4: res=div(a,b);
					break;
			default: System.out.println("try again");
					break;
		}
	}

		public static double add(double a, double b) 
		{
			double res1;
			res1=a+b;
			System.out.println("addition of two number " + res1);
			return res1;
		}

		public static double sub(double a, double b)
		{
			double subtraction;
			if(a>b) {
				subtraction=a-b;
				System.out.println("subtraction of two numbers " + subtraction);
				return subtraction;
			} else  {
				subtraction=b-a;
				System.out.println("subtraction of two numbers  " + subtraction);
				return subtraction;
			}
		}

		public static double mul(double a, double b)
		{
			double res2;
			if ((a==0) || (b==0)) {
				System.out.println("multiplication is zero");
				return 0.0;
			}
			else {
				res2=a*b;
			System.out.println("multiplicaton of two numbers " + res2);
			return res2;
			}
		}

		public static double div(double a, double b)
		{
			double res3;
			if(b==0) {
				System.out.println("not possible");
				return 0.0;
			} else {
				res3=a/b;
				System.out.println("division of two numbers " + res3);
				return res3;
			}
		} 
	}
	
