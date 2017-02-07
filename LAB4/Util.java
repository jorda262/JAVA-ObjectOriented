package labs;

import java.text.DecimalFormat;

public class Util 
{
	//Method for converting Celsius to Fahrenheit.
	public static double celsiusToFahrenheit(double celsius) 
	{
		double fahrenheit = (((9.0/5)*celsius) + 32);
		return fahrenheit;
	}
	//Method for converting feet to meters.
	public static double footToMeter(double foot) 
	{
		double meter = (.305*(foot));
		return meter;
	}
	//Method for displaying triangular pattern of numbers.
	public static void display(int n) 
	{
		int i, j;
		for (i = 1; i <= n; i++)
		{
			for(j = 1; j <= i; j++)
			{
                System.out.print(j + " ");
            }
            System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		//List of Variables.
		double celsius = 32.0;
		double feet = 12.0;
		int n = 5;
		double fah = celsiusToFahrenheit(celsius);
		double meter = footToMeter(feet);
		
		//Formatter for decimals in outputs.
		DecimalFormat formatter = new DecimalFormat("##0.#");
		formatter.format(meter);
		DecimalFormat formatter2 = new DecimalFormat("##0.0#");
		formatter2.format(fah);
		
		//Display outputs.
		System.out.println(celsius + " Celsius = " + fah + " fahrenheit");
		System.out.println(feet + " Foot = " + meter + " Meter");
		System.out.println("Pattern: ");
		display(n);
	}
}
