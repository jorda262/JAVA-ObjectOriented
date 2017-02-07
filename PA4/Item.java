package pa4;

public class Item implements Comparable<Item>
{
	private String name;
	private int uid;
	private String description;
	private double price;
	
	public Item()
	{
		setName("");
		setUID(0);
		setDescription("");
		setPrice(0.0);
	}
	
	public Item(String name, int uid, String description, double price) {
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
	
	public String toString() {
		return uid + " " + name + " " + description + " " + price;
	}
	
	public int compareTo(Item o)
	{
		return this.uid > o.uid ? 1 : (this.uid < o.uid ? -1 : 0);
	}

	


}