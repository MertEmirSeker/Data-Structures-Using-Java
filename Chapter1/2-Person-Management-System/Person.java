public class Person{


	private String name;
	private String ssn;
	private int age;
	private Gender gender;
	private String adress;
	private String telno;
	
	
	// constructor
	Person(String name, String ssn, int age, Gender gender, String adress, String telno)
	{
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
		this.telno = telno;
	}
	
	
	// getters
	public String getName()
	{
		return name;
	}
	
	public String getSSN()
	{
		return ssn;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	
	public String getAdress()
	{
		return adress;
	}
	
	public String getTelno()
	{
		return telno;
	}
	
	// toString method
	@Override
	public String toString()
	{
	    return "PERSON\n" +
	    		"Name: " + getName() + "\n" +
		        "SSN: " + getSSN() + "\n" +
		        "Age: " + getAge() + "\n" +
		        "Gender: " + getGender() + "\n" +
		        "Address: " + getAdress() + "\n" +
		        "Telephone Number: " + getTelno();
	}
	
	// main method
	public static void main(String[] args)
	{
		Person p1 = new Person("Mehmet", "12345678901", 30, Gender.MALE ,  "Kadıköy/İstanbul", "9876543210");
		System.out.println(p1.toString());
	}
	
}
