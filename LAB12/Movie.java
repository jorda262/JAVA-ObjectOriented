public class Movie 
{
	private String title;
	private int minutes;
	private int year;
	protected double price;
	
	public Movie(String title, int year, double price)
	{
		this.title = title;
		this.year = year;
		this.price = price;
		this.minutes = 100; 
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}
	
	public void printDescription()
	{
		System.out.println("Title: " + this.title);
		System.out.println("Minutes: " + this.minutes);
		System.out.println("Year: " + this.year);
		System.out.println("Price: $" + this.price);
	}
	
	public static void main(String[] args)
	{
		Movie movie = new Movie("Batman", 2000, 11.99);
		movie.printDescription();
	}
}
