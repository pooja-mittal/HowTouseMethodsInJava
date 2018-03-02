class exercise4
{
	public static void main(String[] args)
	{
		displayS();
		exercise4 t=new exercise4();
		t.displayN();
	}

	static void displayS()
	{
		System.out.println("due to static java is easy");
	}

	void displayN()
	{
		System.out.println("due to non static, java is tough");
	}
}