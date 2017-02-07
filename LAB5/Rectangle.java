import java.text.DecimalFormat;

public class Rectangle 
{
	private double height;
	private double width;
	private String color;
	private boolean isSquare;
	
	//Default constructor.
	public Rectangle()
	{
		setHeight(2);
		setWidth(1);
		setColor("White");
		setIsSquare();
	}
	
	//Width & Height constructor.
	public Rectangle(double width, double height)
	{
		setHeight(height);
		setWidth(width);
		setColor("White");
		setIsSquare();
	}

	//Accessors methods.
	public double getHeight()
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}
	public String getColor()
	{
		return color;
	}
	public boolean getIsSquare()
	{
		return (height == width);
	}
	
	//Mutators methods.
	public void setHeight(double height)
	{
		this.height = height;
		setIsSquare();
	}
	public void setWidth(double width)
	{
		this.width = width;
		setIsSquare();
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setIsSquare()
	{
		isSquare = (height == width);
	}
	
	//To String method.
	public String toString()
	{
		String totalString;
		totalString = "\nSummary:" + "\n----------\n" +
		"Rectangle height: " + height + "\nRectangle width: " +
		width + "\nRectangle color: " + color + "\nIs the rectangle square? " +	
		isSquare;
		getArea();
		return totalString;
	}
	
	//Area method.
	public String getArea()
	{
		double area = height * width;  
		DecimalFormat formatter = new DecimalFormat("#0.0#");
		String formattedArea = formatter.format(area);
		String totalArea = formattedArea + " units squared";
		return totalArea;
	}
}
