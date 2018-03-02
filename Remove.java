class Remove
{
	public static void main(String[] args)
	{
		String s=new String("Hello world");
		System.out.println(s);
		String s2=s.replace("H", "W");
		System.out.println(s2);
		String s3=s.replace("He", "wa");
		System.out.println(s3);
		String s4=s.replace('e', 'a');
		System.out.println(s4);
	}
}
