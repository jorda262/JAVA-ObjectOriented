/*This program generates three random numbers
and asks the user to make three guesses of what
these random numbers will be. If you get all 
three correct in the right order you win the 
the grand prize. If you get three right in the 
wrong order you win a prize. If you get one right
you also win a prize. If you get zero right you
get no prize. */
import java.util.Scanner;

public class MyWinningApp 
{
	public static void main(String[] args)
	{
		//Variables.
		int guess1, guess2, guess3;
		int perfectMatch = 0, match = 0, totalMatches;
		int num1 = (int)(Math.random()*101);
		int num2 = (int)(Math.random()*101);
		int num3 = (int)(Math.random()*101);
		
		Scanner cin = new Scanner(System.in);
		
		//Prompt user to make three guess.
		System.out.println("Enter first guess:");
		guess1 = cin.nextInt();
		System.out.println("Enter second guess:");
		guess2 = cin.nextInt();
		System.out.println("Enter third guess:");
		guess3 = cin.nextInt();
		
		//Displays the three random numbers and the user's three guesses.
		System.out.println("Generated numbers: " +num1 +" " +num2 + " " +num3);
		System.out.println("User's entered guesses: " +guess1 +" " +guess2 + " " +guess3);
		
		//If-Else statements for guess1.
		if (guess1 == num1)
			perfectMatch++;
		else if (guess1 == num2 || guess1 == num3)
			match++;
		
		//If-Else statements for guess2.
		if (guess2 == num2)
			perfectMatch++;
		else if (guess2 == num1 || guess2 == num3)
			match++;
		
		//If-else statements for guess3.
		if (guess3 == num3)
			perfectMatch++;
		else if (guess3 == num1 || guess3 == num2)
			match++;
		
		//Calculation to determine number of matches.
		totalMatches = perfectMatch + match;
		
		//If statement for perfect match!
		if (perfectMatch == 3)
		{
			System.out.println("Jackpot! You win $100000!");
		}
		
		//Else statement with nested If-Else statements to determine prize.
		else
		{
			if (totalMatches == 3)
			{
				System.out.println("You won $5000");
			}
			else if (totalMatches == 1 || totalMatches == 2)
			{
				System.out.println("You won $250");
			}
			else
			{
				System.out.println("You won $0");
			}
		}
		
		cin.close();
	}
}
