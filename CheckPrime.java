import java.util.Scanner;
class CheckPrime
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		int num=scr.nextInt();
			isPrime(num);
		}
	
public static void isPrime(int n)
{
	if(n<2) {
		System.out.println("not prime");
		return;
	} 
		for(int i=2; i<=(n/2); i++) {
			if((n%i)==0) {
				System.out.println("not prime");
				return;
		}
		}
		System.out.println(n + " is prime");
		return;
	
	
}
}
