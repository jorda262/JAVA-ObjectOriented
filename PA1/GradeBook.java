/*This program asks the user for various graded activities
and your score associated with that activity. It then takes 
all of the information and puts it into a easily readable
table and displays your overall score.*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeBook 
{
	public static void main(String[] args)
	{
		//Variables.
		double score1, score2, score3, score4, score5, scoreTotal, percent;
		int total1 = 10 , total2 = 10, total3 = 20, total4 = 30, total5 = 30,cumulativeTotal = 100;
		String activity1, activity2, activity3, activity4, activity5;
		Scanner keyboard = new Scanner(System.in);
		
		//I/O for getting name of activity and the score in that activity.
		System.out.println("Name of activity (e.g., Inclass):");
		activity1 = keyboard.nextLine();
		System.out.println(activity1 + " Percentage 10%. Enter a score recieved for " + activity1 +":");
		score1 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Name of activity (e.g., Labs):");
		activity2 = keyboard.nextLine();
		System.out.println(activity2 + " Percentage 10%. Enter score recieved for " + activity2 + ":");
		score2 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Name of activity (e.g., PAs):");
		activity3 = keyboard.nextLine();
		System.out.println(activity3 + " Percentage 20%. Enter score recieved for " + activity3 +":");
		score3 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Name of activity (e.g., Midterm):");
		activity4 = keyboard.nextLine();
		System.out.println(activity4 + " Percentage 30%. Enter score recieved for " + activity4 + ":");
		score4 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Name of activity (e.g., FinalExam):");
		activity5 = keyboard.nextLine();
		System.out.println(activity5 + " Percentage 30%. Enter score recieved for " + activity5 + ":");
		score5 = keyboard.nextDouble();
		
		//Basic calculations for determining total score and the percent.
		scoreTotal = score1 + score2 + score3 + score4 + score5;
		percent = ((scoreTotal/cumulativeTotal)*100);
		
		//DecimalFormat class creating objects to pattern format.
		DecimalFormat formattingObject = new DecimalFormat("##0.0#");
		DecimalFormat percentFormatter = new DecimalFormat("##0.00");
		
		//Converts scoreTotal and percent into formatted patterns.
		String formattedScoreTotal = formattingObject.format(scoreTotal);
		String formattedPercent = percentFormatter.format(percent);
		
		//Output of all the information into a table.
		System.out.println("=============Grades Summary=============");
		System.out.printf("%-30s %-12s %-26s%n", "Activities","Percentage", "Total Possible Percentage");
		System.out.printf("\n%-30s %-12.2f %-2d%s %n", activity1, score1, total1, "%");
		System.out.printf("%-30s %-12.2f %-2d%s %n", activity2, score2, total2, "%");
		System.out.printf("%-30s %-12.2f %-2d%s %n", activity3, score3, total3, "%");
		System.out.printf("%-30s %-12.2f %-2d%s %n", activity4, score4, total4, "%");
		System.out.printf("%-30s %-12.2f %-2d%s %n", activity5, score5, total5, "%");
		System.out.printf("%-30s %-12.2f %-3d%s %n", "Total", scoreTotal, cumulativeTotal, "%");
		System.out.println("\nYour total is " +formattedScoreTotal + " out of " +cumulativeTotal + ", or " + formattedPercent +"%.");
	
		keyboard.close();
	}
}