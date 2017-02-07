import java.text.DecimalFormat;

public class BMI 
{
	public static void main(String[] args)
	{
		int weight = 180;
		double height = 72.0;
		double bodyMassIndex;
		
		bodyMassIndex = ((weight / (height * height)) * 703);
		
		DecimalFormat formattingObject = new DecimalFormat("##0.00");
		
		String formattedBodyMassIndex = formattingObject.format(bodyMassIndex);
		
		System.out.println("Your BMI is: " + formattedBodyMassIndex);
	}
}
