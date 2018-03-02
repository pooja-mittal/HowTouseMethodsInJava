class CLA
{
	public static void main(String[] args)
	{
		add(5,2,13,4);
	}

	public static int add(int...a)
	{
		int sum=0;
		for(int i=0; i<(a.length); i++) {
			sum += a[i];
		}
		System.out.println(sum);
		return sum;
	}
}