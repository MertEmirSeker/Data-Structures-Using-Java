
public class HourlyEmployee extends Employee{
	
	private double hourlyRate;
	private int hoursWorked;
	private double unionDues;
	
	
	// constructor
	HourlyEmployee(String name, String ssn, int age, Gender gender, String adress, String telno, String department, String jobTitle, int yearOfHire, double hourlyRate, int hoursWorked, double unionDues)
	{
		super(name, ssn, age, gender, adress, telno, department, jobTitle, yearOfHire);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.unionDues = unionDues;
	}
	
	// getters
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	
	public double getUnionDues()
	{
		return unionDues;
	}
	
	// toString method
	@Override
	public String toString()
	{
	    return "HOURLY EMPLOYEE\n" +
	    		"Name: " + getName() + "\n" +
		        "SSN: " + getSSN() + "\n" +
		        "Age: " + getAge() + "\n" +
		        "Gender: " + getGender() + "\n" +
		        "Address: " + getAdress() + "\n" +
		        "Telephone Number: " + getTelno() + "\n" +
		        "Department: " + getDepartment() + "\n" + 
		        "Job Title: " + getJobTitle() + "\n" + 
		        "Year Of Hire: " + getYearOfHire() + "\n" +
		        "Hourly Rate: " + getHourlyRate() + "\n" + 
		        "Hourse Worked: " + getHoursWorked() + "\n" +
		        "Union Dues: " + getUnionDues();
	}
	
	// main method
	public static void main(String [] args)
	{
		HourlyEmployee he1 = new HourlyEmployee("Fatma", "0123456789", 25, Gender.FEMALE, "Beşiktaş/İstanbul", "5555555555", "IT Department", "Software Developer", 2020, 25.0, 40, 10.0);
		System.out.println(he1.toString());
	}
	

}
