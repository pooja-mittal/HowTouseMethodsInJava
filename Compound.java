import java.util.Scanner;
class Compound
{
	public static void main(String[] args)
	{
		double si, r;
		int p,t;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the principal");
		 p=scr.nextInt();
		System.out.println("enter the rate of interest");
		 r=scr.nextDouble();
		System.out.println("enter the time period");
		 t=scr.nextInt();
		 Compound obj=new Compound();
		si=obj.cmp(p,r,t);
	}
}
	class E {
 
	double cmp(int a, double b, int c) {
		double res;
		
		res=a*b*c;
		System.out.println("compound interest: " + res);
		return res;
	}
}
