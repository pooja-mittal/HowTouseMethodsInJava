import java.util.Scanner;
class Series
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter last trem");
		int n=scr.nextInt();
		infiniteSeries(n);
	}

	public static double infiniteSeries(int n)
	{
		double sum=0;
		for(int i=0; i<=n; i++) {
			sum=sum+1/(factorial(i));
			System.out.println("final sum " + sum);
		}
		
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

