import java.util.Scanner;
class Occurrence 
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		int count =0;
		System.out.println("what letter you want to delete");
		char c1=scr.next().charAt(0);
		s=s.toLowerCase();
		int n=s.length();
		char c2=character.toLowercase(c1);
		System.out.println("total length " + n);
		for(int i=0; i<=((s.length())-1); i++) {
			if(c2==s.charAt(i))
				count++;
		}
		System.out.println("total occurrence " + count);
	}
}