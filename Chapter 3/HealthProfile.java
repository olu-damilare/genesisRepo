public class HealthProfile{
	private String firstName;
	private String lastName;
	private String gender;
	private int month;
	private int day;
	private int year;
	private double height;
	private double weight;
	private int maximumHeartRate;


	public HealthProfile(String firstName,String lastName, String gender, 
	int month, int day, int year, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.month = month;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public boolean checkDaysInFebruary(int month, int day, int year){
		boolean isLeapYear = year % 4 == 0 && month == 2 && day <= 29;
		return isLeapYear;
		
	}
	public void setDOB(int month, int day, int year){
		/* if(month >= 1 && month <=12 && day >= 1 && day <= 31 && year >= 1900 && year <= 2021)
		{	if(month == 2 && year % 4 != 0){
				day <= 29}
				*/
			 this.year = year;
			this.month = month;
			this.day = day;}
	}
	public String getDateOfBirth(){
		String DOB = month + "/" + day + "/" + year;
		return  DOB;
	}
	public int calculateAge(){
		int age = 2021 - year;
		return age;
	}
	public void setHeight(double height){
		if(height > 0)
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public void setWeight(double weight){	
		if(weight > 0)
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	public int calculateMHR(){
		int age = 2021 - year;
		maximumHeartRate = 220 - age;
		return maximumHeartRate; 
	}
	public String calculateTargetHeartRate(){
		double minimumTargetHeartRate = 0.5 * ((double) maximumHeartRate);
		double maximumTargetHeartRate = 0.85 * ((double) maximumHeartRate);
		String targetHeartRate = minimumTargetHeartRate + " - " +  maximumTargetHeartRate;
		return targetHeartRate;
	}
	public double calculateBMI(){
		double BodyMassIndex = (weight * 703)/(height * height);
		return BodyMassIndex;
	}
}