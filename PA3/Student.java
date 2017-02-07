import java.text.DecimalFormat;

public class Student extends Person
{
	private double gpa;
	private String major;
	
	//No-argument constructor.
	public Student()
	{
		super();
		gpa = 0;
		major = null;
	}
	
	//Multiple-argument constructor.
	public Student(String firstName, String lastName, String address, 
			       String phoneNumber, double gpa, String major)
	{
		super(firstName,lastName,address,phoneNumber);
		setGPA(gpa);
		setMajor(major);
		
	}
	
	//Accessors.
	public double getGPA()
	{
		return gpa;
	}
	public String getMajor()
	{
		return major;
	}
	//Mutators.
	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	//toString method for Student class.
	@Override
	public String toString()
	{
		
		String personInfo;
		DecimalFormat gpaFormatter = new DecimalFormat("0.0#");
		personInfo = super.toString() + "\n\tMajor: " + major + "\n\tGPA: " 
				+ gpaFormatter.format(gpa) + "\n";
		return personInfo;
	}
}
