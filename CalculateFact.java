class CalculateFact
{
	public static void main(String[] args)
	{
		int a=getFact(5);
		System.out.println(a);
	}

	public static int getFact(int n)
	{
		if(n==0)
			return 1;
		return n*getFact(n-1);
	}
}