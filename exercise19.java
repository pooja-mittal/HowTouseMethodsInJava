import java.util.Scanner;
class exercise19
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=scr.nextInt();
		int b=scr.nextInt();
		int c=scr.nextInt();
		isOrder(a,b,c);
	}

	static void isOrder(int a, int b, int c)
	{
		if((a>b) && (a>c)) 
			System.out.println("they are in incresing order");
			else if((c>a) && (c>b))
				System.out.println("they are in decreasing order");
			else System.out.println("no any order");
		}
	
}
