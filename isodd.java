import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one number");
		int n=scr.nextInt();
		boolean b=isOdd(n);
	}

	public static boolean isOdd(int a)
	{
		if(a<0) {
			System.out.println("yes it is ODD");
		return true;
		} else {
			System.out.println("try again");
		return false;
		}
	}
}
