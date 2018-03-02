import java.util.Scanner;
class B
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		int n=scr.nextInt();
		boolean b =hasEight(n);
	}

	public static boolean hasEight(int num)
	{
		int rem,a=0;
		while(num>0)
		{
			rem=num%10;
			if(rem==8) {
				a=1;
				System.out.println("yes this number contain eight");
				return true;
			}
			num=num/10;
		}
		if(a==0) {
			System.out.println("there is no eight");
			
		}
		return false;
	}
}



