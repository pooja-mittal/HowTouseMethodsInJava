class Box 
{
	double width, height, depth;
	public static void main(String[] args) 
	{
		Box obj1= new Box();
		Box obj2=new Box();

		obj1.width=10;
		obj1.height=20;
		obj1.depth=15;
		//double volume;
		double volume=((obj1.width)*(obj1.height)*(obj1.depth));
		System.out.println("ist box volume: " + volume);
		obj2.width=20;
		obj2.height=40;
		obj2.depth=30;
		 volume=obj2.width*obj2.height*obj2.depth;
		System.out.println("2nd box volume: " + volume);
	}
}
	
