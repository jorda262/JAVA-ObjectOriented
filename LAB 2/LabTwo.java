import java.util.Scanner;
import java.text.DecimalFormat;

public class LabTwo 
{
	public static void main(String[] args)
	{
		String item;
		double price, total, totalTaxes, taxRate, subTotal;
		int quantity;
		
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Enter Item description (e.g., Cheese Burger):");
		item = cin.nextLine();
		System.out.println("Enter price (e.g., 20.99):");
		price = cin.nextDouble();
		System.out.println("Enter quantity (e.g., 5):");
		quantity = cin.nextInt();
		System.out.println("Enter sales tax rate (e.g., 0.07625):");
		taxRate = cin.nextDouble();
		
		subTotal = (quantity * price);
		totalTaxes = (subTotal * taxRate);
		total = subTotal + totalTaxes;
		
		DecimalFormat percent = new DecimalFormat("##0.00%");
		String percentTaxRate = percent.format(taxRate);
		
		System.out.println("\n*****Purchase Summary*****");
		System.out.printf("%8s%-16s %-10s%n","","Description:",item);
		System.out.printf("%8s%-16s %1s%-10.2f%n","","Price:", "$",price);
		System.out.printf("%8s%-16s %-10d%n","","Quantity:",quantity);
		System.out.printf("%8s%-16s %-10s%n","","Tax rate:",percentTaxRate);
		System.out.printf("%n%-25s %1s%-10.2f", "Subtotal :","$", subTotal);
		System.out.printf("%n%-25s %1s%-10.2f", percentTaxRate + "  sales tax:","$", totalTaxes);
		System.out.printf("%n%-25s %1s%-10.2f", "Total :", "$", total);
		
		cin.close();
	}
}