import java.util.Scanner;
public class HealthProfileTest{
	public static void main(String[] args){
		HealthProfile patient = new HealthProfile("John", "Doe", "Male", 5, 27, 1988, 72.50, 200.00);

		System.out.println("Enter your first name: ");
		Scanner input = new Scanner(System.in);
		String patientFirstName = input.nextLine();
		patient.setFirstName(patientFirstName);

		System.out.println("Enter your last name: ");
		String patientLastName = input.nextLine();
		patient.setLastName(patientLastName);
		
		System.out.println("Enter your month of birth: ");
		int patientMonthOfBirth = input.nextInt();

		System.out.println("Enter your day of birth: ");
		int patientDayOfBirth = input.nextInt();
		
		System.out.println("Enter your year of birth: ");
		int patientYearOfBirth = input.nextInt();
			
		patient.setDOB(patientMonthOfBirth, patientDayOfBirth, patientYearOfBirth);

		System.out.println("Enter your height in inches: ");
		double patientHeightInInches = input.nextDouble();
		patient.setHeight(patientHeightInInches);

		System.out.println("Enter your weight in pounds: ");
		double patientWeightInPounds = input.nextDouble();
		patient.setHeight(patientHeightInInches);

		System.out.println("The patient's full name is " + patient.getFirstName() + " " + patient.getLastName());
		System.out.println("The patient's date of birth is " + patient.getDateOfBirth());
		System.out.println("The patient's age is " + patient.calculateAge());
		System.out.println("The patient's gender is " + patient.getGender());
		System.out.println("The patient's height is " + patient.getHeight());
		System.out.println("The patient's weight is " + patient.getWeight());
		System.out.println("The patient's Maximum Heart Rate is " + patient.calculateMHR() + " beats per minute");
		System.out.println("The patient's Target Heart Rate is " + patient.calculateTargetHeartRate() + " beats per minute");
		System.out.println();
		System.out.printf("The patient's Body Mass Index is %.2f%n", patient.calculateBMI());
		System.out.println();
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:	between 18.5 and 24.9");
		System.out.println("Overweight:	between 25 and 29.9");
		System.out.println("Obese:	30 or greater");
	}


}