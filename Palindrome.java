import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.next();
		s=s.toLowerCase();
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s1)
	{
		int n=s1.length();
		for(int i=0; i<n/2; i++) {
			if((s1.charAt(i))!=(s1.charAt(n-1-i))) {
				System.out.println("string is not plaindrome");
				return false;
					
			}
			
		}
		System.out.println("palindrome");
		return true;
	}
}
