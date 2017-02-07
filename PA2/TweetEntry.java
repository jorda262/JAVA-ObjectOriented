import java.util.Date;

public class TweetEntry 
{
	Date dates = new Date();
	
	private String first;
	private String last;
	private String user;
	private String tweet;
	private String date;
	
	//Constructor.
	public TweetEntry(String first, String last, String user, String tweet)
	{
		setFirst(first);
		setLast(last);
		setUser(user);
		setTweet(tweet);
		date = dates.toString();
	}
	
	//Accessor methods.
	public String getFirst()
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}
	public String getUser()
	{
		return user;
	}
	public String getTweet()
	{
		return tweet;
	}
	public String getDate()
	{
		return date;
	}
	
	//Mutator methods.
	public void setFirst(String first)
	{
		this.first = first;
	}
	public void setLast(String last)
	{
		this.last = last;
	}
	public void setUser(String user)
	{
		this.user = user;
	}
	public void setTweet(String tweet)
	{
		this.tweet = tweet;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	
	//boolean
	public boolean equals(TweetEntry tweetObj)
	{
		return (tweetObj.tweet.length() == this.tweet.length());
	}
	
	//display method.
	public String toString()
	{
		String totalString;
		totalString = "Profile Summary:\n\tFirst Name: " + first + "\n\tLast Name: " +
					   last + "\n\tUsername: #" + user + "\n\tDate started: " + date;
		return totalString;
	}
	
	//Method that displays the tweet.
	public void showMyTweet()
	{
		System.out.println(first + " " + last.substring(0, 1) + " @" + user);
		System.out.print("#" + user + " ");
		
		if (tweet.length() < 72)
		{
			System.out.println(tweet + "\n");
		}
		else if(tweet.length() <= 140)
		{
			System.out.println(tweet.substring(0,72));
			System.out.println("\t" + tweet.substring(72) + "\n");
		}
		else
		{
			System.out.println(tweet.substring(0,72));
			System.out.println("\t" + tweet.substring(72,140) + "...\n");
		}
	}
}