
public class Employee extends Person {

	private String department;
	private String jobTitle;
	private int yearOfHire;
	
	// constructor
	Employee(String name, String ssn, int age, Gender gender, String adress, String telno, String department, String jobTitle, int yearOfHire)
	{
		super(name, ssn, age, gender, adress, telno);
		this.department = department;
		this.jobTitle = jobTitle;
		this.yearOfHire = yearOfHire;
	}
	
	// getters
	public String getDepartment()
	{
		return department;
	}
	
	public String getJobTitle()
	{
		return jobTitle;
	}
	
	public int getYearOfHire()
	{
		return yearOfHire;
	}
	
	
	// toString method
	@Override
	public String toString()
	{
	    return "EMPLOYEE\n" +
	    		"Name: " + getName() + "\n" +
		        "SSN: " + getSSN() + "\n" +
		        "Age: " + getAge() + "\n" +
		        "Gender: " + getGender() + "\n" +
		        "Address: " + getAdress() + "\n" +
		        "Telephone Number: " + getTelno() + "\n" +
		        "Department: " + getDepartment() + "\n" + 
		        "Job Title: " + getJobTitle() + "\n" + 
		        "Year Of Hire: " + getYearOfHire();
	}
	
	public static void main(String [] args)
	{
		Employee e1 = new Employee("Ayşe", "9876543210", 28, Gender.FEMALE ,  "Şişli/İstanbul", "12345678901", "Human Resources", "HR Manager", 2018);
		System.out.println(e1.toString());
	}
}
