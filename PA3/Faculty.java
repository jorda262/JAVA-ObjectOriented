import java.text.DecimalFormat;

public class Faculty extends Person
{
	private double salary;
	private String department;
	private boolean isFullTime;
	
	//No-argument constructor.
	public Faculty()
	{
		super();
		salary = 0;
		department = null;
		isFullTime = true;
	}
	
	//Multiple-argument constructor.
	public Faculty(String firstName, String lastName, String address, 
			       String phoneNumber, double salary, String department,
			       boolean isFullTime)
	{
		super(firstName,lastName,address,phoneNumber);
		setIsFullTime(isFullTime);
		setSalary(salary);
		setDepartment(department);
	}
	
	//Accessors.
	public double getSalary()
	{
		return salary;
	}
	public String getDepartment()
	{
		return department;
	}
	public boolean getIsFullTime()
	{
		return isFullTime;
	}
	
	//Mutators.
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public void setIsFullTime(boolean isFullTime)
	{
		this.isFullTime = isFullTime;
	}
	
	//toString method for Student class.
	@Override
	public String toString()
	{
		
		String personInfo;
		DecimalFormat formatter = new DecimalFormat("0.00");
		personInfo = super.toString() + "\n\tDepartment: " + department + "\n\tFull time: "
				+ isFullTime + "\n\tSalary: $" +formatter.format(salary)+"\n";
		return personInfo;
	}
}

