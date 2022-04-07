
public class Box {
	double width;
	double height;
	double depth;
	Box(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
	double getVolumeOfBox()
	{
		return width*height*depth;
	}
	public static void main(String[] args)
	{
		Box box = new Box(10 , 20 , 30);
		System.out.println("Volume of the box is : "+ box.getVolumeOfBox());
	}
}