package pa4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingCart 
{
	private ArrayList<Item> list = new ArrayList<Item>();
	Scanner scan;
	
	public void loadData() throws FileNotFoundException 
	{
		
		scan = new Scanner(new File("unsortedItems.txt"));
		
		
	
		while(scan.hasNext())
		{
			String line = scan.nextLine();
			String [] array = line.split(" ");
			int uid = Integer.parseInt(array[0]);
			String name = array[1];
			String description = array[2];
			double price = Double.parseDouble(array[3]);
			Item item = new Item(name, uid, description, price);
			list.add(item);
		}
		
		scan.close();
		
	}
	
	public void display() 
	{
		System.out.println("*******************************");
		int i;
		for(i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("*******************************\n");
	}
	
	public void sortItems() 
	{
		Collections.sort(list);
	}
	
	public void search(int uid)
	{
		int counter = 0;
		for (int i = 0; i < list.size(); i++)
		{
			Item items = list.get(i);
			if(items.getUID() == uid)
			{
				System.out.println("Item with uid: " + uid + " found!!");
				counter++;
			}
			
		}
		
		if(counter == 0)
		{
		System.out.println("Item with uid: " + uid + " NOT found!!");
		}
	}

	
	public static void main(String[] args) 
	{
		
		ShoppingCart cart = new ShoppingCart();
	
		
		try {
			cart.loadData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cart.display();
		cart.sortItems();
		cart.display();
		cart.search(4825);
		cart.search(3333);
		cart.search(642);
		cart.search(4229);
	}

}
