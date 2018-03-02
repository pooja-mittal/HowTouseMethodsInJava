import java.util.Scanner;
class Series1
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter num");
		int num=scr.nextInt();
		System.out.println("enter total no of terms");
		int n=scr.nextInt();
		alternateSeries(num,n);
	}

	public static double alternateSeries(int num, int n)
	{
		double sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				sum -=Math.pow(num,i)/(factorial(i));
			} else 
				sum +=Math.pow(num,i)/(factorial(i));
		} System.out.println("sum " + sum);
		return sum;
	}

	public static double factorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		return fact;
	}
}
