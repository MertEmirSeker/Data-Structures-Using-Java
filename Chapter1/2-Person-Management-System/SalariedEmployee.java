
public class SalariedEmployee extends Employee
{
	private double annualSalary;
	
	
	// constructor
	SalariedEmployee(String name, String ssn, int age, Gender gender, String adress, String telno, String department, String jobTitle, int yearOfHire,double annualSalary)
	{
		super(name, ssn, age, gender, adress, telno, department, jobTitle, yearOfHire);
		this.annualSalary = annualSalary;
	}
	
	// getters
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	

	
	// toString method
	@Override
	public String toString()
	{
	    return "SALARIED EMPLOYEE\n" +
	    		"Name: " + getName() + "\n" +
		        "SSN: " + getSSN() + "\n" +
		        "Age: " + getAge() + "\n" +
		        "Gender: " + getGender() + "\n" +
		        "Address: " + getAdress() + "\n" +
		        "Telephone Number: " + getTelno() + "\n" +
		        "Department: " + getDepartment() + "\n" + 
		        "Job Title: " + getJobTitle() + "\n" + 
		        "Year Of Hire: " + getYearOfHire() + "\n" +
		        "Annual Salary: " + getAnnualSalary();
	}
	
	// main method
	public static void main(String[] args)
	{
	SalariedEmployee sa1 = new SalariedEmployee("Ali", "9876543210", 35, Gender.MALE, "Ümraniye/İstanbul", "4444444444", "Finance Department", "Accountant", 2015, 60000.0);
	System.out.println(sa1.toString());
	}
	
}
