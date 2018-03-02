import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the last range");
		int n=scr.nextInt();
		for(int i=1; i<=n; i++) {
			if(isPrime(i))
				System.out.print(i + " " );
		}
	}

	static boolean isPrime(int n)
	{
		if(n<2) return false;
		for(int i=2; i<=n/2; i++) {
			if((n%i)==0)
				return false;
		}
			
		 return true;
		
	}
}
