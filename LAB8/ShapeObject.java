
import java.util.Date;

public class ShapeObject {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;
	
	/**
	 * Construct a default shape object
	 */
	public ShapeObject() {
		dateCreated =  new Date();
	}
	
	/** return color */
	public String getColor() {
		return color;
	}
	
	/** set a new color */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	/** Return filled */
	public boolean isFilled() {
		return filled;
	}
	
	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/** return dateCreated */
	public Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		String shapeInfo = "created on: " + dateCreated + "\nColor: " + color + "\nFilled: " + filled + "\n";
		return shapeInfo;
	}
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle(4.0, 4.0, 7.0);
		System.out.println(triangle.toString());
		ShapeObject shape = new ShapeObject();
		shape.setFilled(true);
		shape.setColor("teal");
		Triangle triangle2 = new Triangle(3.0,4.0,5.0);
		System.out.println(triangle2.toString());
	}
}
