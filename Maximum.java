import java.util.Scanner;
class Maximum
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scr.nextInt();
		int b=scr.nextInt();
		int c=max(a,b);
		System.out.println("maximum number is: " + c);
	}
	public static int max(int a, int b) {
		int max;
			if(a>b) {
			max=a;
			System.out.println(" a is maximum");
			return max;
		} else {
			max=b;
			System.out.println("b is maximum");
			return max;
			}
	}
}
