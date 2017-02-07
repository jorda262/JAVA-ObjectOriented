public class RectangleDriver
{
	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getColor());
		System.out.println(rectangle.getIsSquare());
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.toString());
		
		rectangle.setHeight(0);
		rectangle.setWidth(0);
		rectangle.setColor("Blue");
		System.out.println(rectangle.toString());
		System.out.println(rectangle.getArea());
		
		Rectangle newRectangle = new Rectangle(7.5, 6.5);
		System.out.println(newRectangle.toString());
		System.out.println(newRectangle.getArea());
	}
}