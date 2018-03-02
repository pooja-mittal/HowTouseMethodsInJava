import java.util.Scanner;
class addition3
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=scr.nextInt();
		int b=scr.nextInt();
		int c=scr.nextInt();
		int res=addition(a,b,c);
	}

	static int addition(int p, int q, int r)
	{
		int fin;
		fin=p+q+r;
		System.out.println(fin);
		return fin;
	}
}

