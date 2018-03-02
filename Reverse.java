import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s1=scr.nextLine();
		int n=s1.length();
		System.out.println("length of string " + n);
		System.out.println();
		System.out.println("original string " + s1);		
		String s2="";
		if (s1==null)
			return;
		for(int i=(n-1); i>=0; i--) {
			s2 +=s1.charAt(i);
		}
		System.out.println("new string " + s2);
	}
}

