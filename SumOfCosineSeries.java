import java.util.Scanner;
class Cosine
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		int num=scr.nextInt();
		double pi=3.14159265;
		//double num=pi/4;
		System.out.println("num " + num);
		System.out.println("enter total no of terms");
		int n=scr.nextInt();
		cosSeries(num,n);
	}

	public static double cosSeries(int num, int n)
	{
		double sum=0;
		for(int i=0; i<n; i++) {
			if(i%2==0) 
				sum +=Math.pow(num,2*i)/(factorial(2*i));
		else sum -=Math.pow(num,2*i)/(factorial(2*i));
		}
		System.out.println("sum " + sum);
		return sum;
	}

	public static double factorial(int n)
	{
		int fact=1;
		if(n==0)
			return 1;
		 else {
			for(int i=1; i<=n; i++) {
				fact=fact*i;
			}
		 }
		 return fact;
	}
}