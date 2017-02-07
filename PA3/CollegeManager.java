import java.text.DecimalFormat;
import java.util.Scanner;

public class CollegeManager 
{
	private static Scanner cin = new Scanner(System.in);
	//Method for initial Menu Questions.
	public static String menuQuestions()
	{
		String choice;
		System.out.println("Which type of person's data do you want to enter?");
		System.out.println("\tFor Student type S or Student");
		System.out.println("\tFor Faculty type F or Faculty");
		System.out.println("\tTo Quit type Q or Quit");
		choice = cin.nextLine();
		return choice;
	}
	
	//Method displaying and asking questions for all people with input validation.
	public static void personInput(Person array)
	{
		do {
			System.out.println("Enter First Name:");
			array.setFirstName(cin.nextLine());
		}while(array.getFirstName().equals(""));
		
		do{
			System.out.println("Enter Last Name:");
			array.setLastName(cin.nextLine());
		}while(array.getLastName().equals(""));
		
		do{
			System.out.println("Enter Address:");
			array.setAddress(cin.nextLine());
		}while(array.getAddress().equals(""));
		
		String phone;
		
		do{
			System.out.println("Enter Phone Number:");
			
			while(!cin.hasNextDouble()){
			cin.nextLine();
			System.out.println("ERROR: Enter Phone Number again:");
			}
			
			phone = cin.nextLine();
			
			array.setPhoneNumber(phone);
			
		}while(phone.length() != 10);
	}
	
	//Method displaying and asking questions for all students with input validation.
	public static void studentInput(Student array)
	{
		Person person = (Person)array;
		personInput(person);
		
		do{
			System.out.println("Enter major:");
			array.setMajor(cin.nextLine());
		}while(array.getMajor().equals(""));
	
		do{
		System.out.println("Enter GPA:");
		array.setGPA(cin.nextDouble());
		}while (array.getGPA() < 0 || array.getGPA() > 4);
		cin.nextLine();
	}
	
	//Method displaying and asking questions for all faculty with input validation.
	public static void facultyInput(Faculty array)
	{
		Person person = (Person)array;
		personInput(person);
		
		do{
		System.out.println("Enter Department:");
		array.setDepartment(cin.nextLine());
		}while(array.getDepartment().equals(""));
		
		do{
		System.out.println("Enter Salary:");
		while(!cin.hasNextDouble()){
			cin.nextLine();
			System.out.println("ERROR: Enter again with only numbers!");
		}
		
		array.setSalary(cin.nextDouble());
		}while(array.getSalary() < 0);
		cin.nextLine();
		
		System.out.println("Enter isSalary:");
		cin.nextBoolean();
		cin.nextLine();
		
	}
	
	//Method for displaying every persons main information.
	public static void displayPersons(Person person)
	{
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
		System.out.println("Address: " + person.getAddress());
		System.out.println("Phone: " + person.getPhoneNumber());
	}
	
	//Method for displaying students information.
	public static void displayStudents(Student [] student)
	{
		if(arrayLength(student) > 0)
		{
			System.out.println("******Students**********");
			System.out.println("Students Record:");
			for(int i = 0; i < arrayLength(student); i++)
			{
				
				Person [] person = (Person[])student;
				displayPersons(person[i]);
				System.out.println("Major: " + student[i].getMajor());
				System.out.println("GPA: " + student[i].getGPA() + "\n");
			}
		}
	}
	
	//Method for displaying faculty information.
	public static void displayFaculty(Faculty [] professors)
	{
		if(arrayLength(professors) > 0)
		{
			System.out.println("******Faculty**********");
			System.out.println("Faculty's Record:");
			for(int i = 0; i < arrayLength(professors); i++)
			{
				DecimalFormat formatter = new DecimalFormat("####0.00");
				Person [] person = (Person[])professors;
				displayPersons(person[i]);
				System.out.println("Department: " + professors[i].getDepartment());
				System.out.println("Salary: $" + formatter.format(professors[i].getSalary()));
				System.out.println("isSalary: " + professors[i].getIsFullTime() + "\n");
			}
		}
	}
	
	//Method for counting number of students entered.
	public static int arrayLength(Student [] array)
	{
		int count = 0;
		for(int i = 0; i < array.length; i++)
		{
			if (array[i].getGPA() != 0)
			{
				count++;
			}
		}
		return count;
	}
	
	//Method for counting number of professors entered.
	public static int arrayLength(Faculty [] array)
	{
		int count = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].getSalary() != 0)
			{
				count++;
			}
		}
		return count;
	}
	
	//MAIN
	public static void main(String[] args)
	{
		final int SIZE = 3;
		Student [] students = new Student [SIZE];
		Faculty [] professors = new Faculty [SIZE];
		
		int i;
		for(i = 0; i < SIZE; i++)
		{
			students[i] = new Student();
			professors[i] = new Faculty();
		}
		
		String choice;
		
		do
		{
			//Method call for menu questions.
			choice = menuQuestions();
			
			
			if(choice.trim().equalsIgnoreCase("Q") || choice.trim().equalsIgnoreCase("Quit"))
			{
				break;
			}
			
			else if (choice.trim().equalsIgnoreCase("S") || choice.trim().equalsIgnoreCase("Student"))
			{
				if(arrayLength(students) < SIZE)
				{
					studentInput(students[arrayLength(students)]);
				}
				else
				{
					System.out.println("Error: Reached the maximum allowed number of Students: " +students.length);
				}
			}
			
			else if(choice.trim().equalsIgnoreCase("F") || choice.trim().equalsIgnoreCase("Faculty"))
			{
				if(arrayLength(professors) < SIZE)
				{
					facultyInput(professors[arrayLength(professors)]);
				}
				else
				{
					System.out.println("Error: Reached the maximum allowed number of Faculty: " + professors.length);
				}
			}

		} while(!(choice.trim().equalsIgnoreCase("Q")) || (!(choice.trim().equalsIgnoreCase("Quit"))));
		
		//Method calls for displaying information when program is quit.
		displayFaculty(professors);
		displayStudents(students);
		cin.close();
	}
}	
