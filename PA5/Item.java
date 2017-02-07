package pa5;

public class Item implements Comparable<Item>
{
	private String name;
	private int uid;
	private String description;
	private double price;
	
	//No argument constructor.
	public Item()
	{
		setName("");
		setUID(0);
		setDescription("");
		setPrice(0.0);
	}
	
	//4 argument constructor.
	public Item(String name, int uid, String description, double price) 
	{
		this.name = name;
		this.uid = uid;
		this.description = description;
		this.price = price;
	}
	
	//Accessor methods.
	public String getName() {
		return this.name;
	}
	public int getUID() {
		return this.uid;
	}
	public String getDescription() {
		return this.description;
	}
	public double getPrice() {
		return this.price;
	}
	
	//Mutator methods.
	public void setName(String name) {
		this.name = name;
	}
	public void setUID(int uid) {
		this.uid = uid;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//toString method.
	public String toString() {
		return uid + "\t" + name + "\t" + description + "\t" + price;
	}
	
	//compareTo method.
	public int compareTo(Item o)
	{
		return this.name.compareToIgnoreCase(o.name);
	}

	

}