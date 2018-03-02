class Factorial
{
	public static void main(String[] args) {
		int n=5,res;
		res=fact(5);
	}

	static int fact(int a)
	{
		int r=1;
		for(int i=1; i<=a; i++) {
			r=r*i;
			
		}
		System.out.println("factorial of " + a + " is " + r);
		return r;
	}
}

