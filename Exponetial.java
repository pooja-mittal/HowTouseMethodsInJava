import java.util.Scanner;
class Exponetial
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter number");
		int num=scr.nextInt();
		System.out.println("enter the last range");
		int n=scr.nextInt();
		exp(num,n);
	}

	public static double exp(int num, int n) {
		double sum=0;
		for(int i=0; i<=4; i++) {
			sum=sum+(Math.pow(num,i))/(factorial(i));
		}
		System.out.println("sum " + sum);
		return sum;
	}

	public static double factorial(int n) {
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

