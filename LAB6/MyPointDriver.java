
import java.text.DecimalFormat;

public class MyPointDriver 
{
	public static void main(String[] args)
	{
		MyPoint point = new MyPoint();
		MyPoint point1 = new MyPoint(3,3,"P2");
		System.out.println(point.toString());
		System.out.println(point1.toString());
		
		DecimalFormat formatter = new DecimalFormat("##0.0#");
		String formattedDistance;
		formattedDistance = formatter.format(point1.distance(point));
		
		System.out.println("The distance between " + point.getPointName() + " and " + 
		point1.getPointName() + " is " + formattedDistance + " units.\n");
		
		MyPoint point2 = new MyPoint(4,5,"P3");
		MyPoint point3 = new MyPoint(-7,-3, "P4");
		System.out.println(point2.toString());
		System.out.println(point3.toString());
		
		DecimalFormat formatter1 = new DecimalFormat("##0.0#");
		String formattedDistance1;
		formattedDistance1 = formatter1.format(point2.distance(point3.getX(), point3.getY()));
		
		System.out.println("The distance between " + point2.getPointName() + " and " + 
		point3.getPointName() + " is " + formattedDistance1 + " units.\n");
	}
}
