import java.text.DecimalFormat;

public class Triangle extends ShapeObject 
{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		super();
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Accessors
	public double getSide1()
	{
		return this.side1;
	}
	public double getSide2()
	{
		return this.side2;
	}
	public double getSide3()
	{
		return this.side3;
	}
	
	//Mutators
	public void setSide1(double side1)
	{
		this.side1 = side1;
	}
	public void setSide2(double side2)
	{
		this.side2 = side2;
	}
	public void setSide3(double side3)
	{
		this.side3 = side3;
	}
	
	//Compute S
	public double getS()
	{
		double lengthS;
		lengthS = ((getSide1() + getSide2() + getSide3())/2);
		return lengthS;
	}
	
	//Get Area method.
	public double getArea()
	{
		double area;
		area = (Math.sqrt(getS()*((getS() - getSide1())*(getS() - getSide2())*(getS() - getSide3()))));
		return area;
	}
	
	public double getPerimeter()
	{
		return (getSide1() + getSide2() + getSide3());
	}
	
	public String toString()
	{
		DecimalFormat formatter = new DecimalFormat("#0.000");
		String finalString;
		finalString = "Date: " + getDateCreated() + "\nColor: " + getColor() 
		+ "\nFilled: " + isFilled() + "\nSide1: " + this.side1 
		+ "\nSide2: " + this.side2 + "\nSide3: " + this.side3
		+ "\nPerimeter: " + getPerimeter() + "\nArea: " + formatter.format(getArea()) + "\n";
		return finalString;
	}
}
