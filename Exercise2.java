class box
{
	double width, height, depth;
	void volume() 
	{
		System.out.print("volume");
		System.out.println(width*height*depth);
	}
}

class demo
{
	public static void main(String[] args)
	{
	box obj1=new box();
	box obj2=new box();
	obj1.width=10;
	obj1.height=20;
	obj1.depth=30;
	obj2.width=20;
	obj2.height=40;
	obj2.depth=60;
obj1.volume();
obj2.volume();
	}
}

