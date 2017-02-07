import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileIO 
{	public static void main(String[] args)
	{
		
		
		PrintWriter outputStream = null;
		
		try 
		{
			outputStream = new PrintWriter(new FileOutputStream("data.txt", true));
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Error opening the file data.txt");
			e.printStackTrace();
			System.exit(0);
		}
		
		for (int i = 0; i < 100; i++)
		{
			outputStream.println((int)(Math.random()*100));
			
		}
		outputStream.close();
	}
}
