public class MyPoint 
{
	private double x;
	private double y;
	private String pointName;
	
	public MyPoint()
	{
		setX(0);
		setY(0);
		setPointName("P1");
	}
	public MyPoint(double x, double y, String pointName)
	{
		setX(x);
		setY(y);
		setPointName(pointName);
	}
	
	//Method named distance from MyPoint type.
	public double distance(MyPoint point)
	{
		double distance;
		distance = calculateDistance(point.x, this.x, point.y, this.y);
		return distance;
	}
	
	//Method named distance from specified x and y coordinates.
	public double distance(double x2, double y2)
	{
		double distance;
		distance = calculateDistance(x2, this.x, y2, this.y);
		return distance;
	}
	
	//Method for calculating distance between two Cartesian coordinates.
	public double calculateDistance(double x1, double x2, double y1, double y2)
	{
		double distance;
		distance = Math.sqrt(Math.pow(((x2) - (x1)), 2) + Math.pow(((y2) - (y1)), 2));
		return distance;
	}
	
	//Accessors.
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public String getPointName()
	{
		return pointName;
	}
	
	//Mutators.
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public void setPointName(String pointName)
	{
		this.pointName = pointName;
	}
	
	//To String method.
	public String toString()
	{
		String finalString;
		finalString = "Point name: " + pointName + "\nX-Coordinate: " + x + "\nY-Coordinate: " + y +"\n";
		return finalString;
	}
}
