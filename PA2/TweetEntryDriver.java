public class TweetEntryDriver 
{
	public static void main(String[] args)
	{
		TweetEntry tweets = new TweetEntry("Zak", "Baani", "zb", 
				"Twitter limits Tweet length to 140 characters "
				+ "making the definition of a \"character\" and how"
				+ " they are counted central to any twitter application.");
		System.out.println(tweets.toString());
		tweets.showMyTweet();
		
		TweetEntry tweets1 = new TweetEntry("Bruce", "Wayne", "bw",
				"Twitter limits Tweet length to 140 characters "
				+ "making the definition of a \"character\" and how"
				+ " they are counted central to any twitter application." );
		System.out.println(tweets1.toString());
		tweets1.showMyTweet();
		System.out.println("The two tweets are the same length: " + tweets1.equals(tweets) + "\n");
		
		TweetEntry tweets2 = new TweetEntry("Gordie", "Howe", "gh", "Gordie Howe Hattrick");
		System.out.println(tweets2.toString());
		tweets2.showMyTweet();
		System.out.println("The two tweets are the same length: " + tweets2.equals(tweets1) + "\n");
	}	
}
