import java.util.Scanner;
class Sine
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		double pi=3.1415;
		//double num=pi/2;
		System.out.println("enter one number");
		int num=scr.nextInt();
		System.out.println("enter the no. of terms");
		int n=scr.nextInt();
		summation(num,n);
	}

	public static double factorial(int n)
	{
		double fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		} return fact;
	}

	public static double summation(int num, int n)
	{
		double sum=0;
		for (int i=0; i<n; i++) {
			if((i%2)==0) 
				sum += (Math.pow(num,(2*i)+1))/(factorial((2*i)+1));
			else 
				sum -=(Math.pow(num, (2*i)+1))/(factorial((2*i)+1));
			
		}System.out.println("final sum " + sum); 
		return sum;
	}
}



