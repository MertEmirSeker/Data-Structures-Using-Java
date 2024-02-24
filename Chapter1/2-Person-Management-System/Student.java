
public class Student extends Person{
	private double gpa;
	private String major;
	private int yearOfGraduate;
	
	// constructor
	public Student(String name, String ssn, int age, Gender gender, String adress, String telno, double gpa, String major, int yearOfGraduate)
	{
		super(name, ssn, age, gender, adress, telno);
		this.gpa = gpa;
		this.major = major;
		this.yearOfGraduate = yearOfGraduate;
	}
	

	// getters
	public double getGPA()
	{
		return gpa;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public int getYearOfGraduate()
	{
		return yearOfGraduate;
	}
	
	// toString method
	@Override
	public String toString() {
	    return 	"STUDENT\n" + 
	    		"Name: " + getName() + "\n" +
	           "SSN: " + getSSN() + "\n" +
	           "Age: " + getAge() + "\n" +
	           "Gender: " + getGender() + "\n" +
	           "Address: " + getAdress() + "\n" +
	           "Telephone Number: " + getTelno() + "\n" +
	           "GPA: " + getGPA() + "\n" +
	           "Major: " + getMajor() + "\n" +
	           "Year of Graduation: " + getYearOfGraduate();
	}
	
	
	// main method
	public static void main(String[] args)
	{
		Student s1 = new Student("Mert", "12345678901", 22, Gender.MALE ,  "Üsküdar/İstanbul", "12345678901", 3.5, "Computer Engineering", 2025);
		System.out.println(s1.toString());
	}
	
}
