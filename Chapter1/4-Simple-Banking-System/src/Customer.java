
public abstract class Customer
{
	
	private String name;
	private String address;
	private int age;
	private String telephoneNumber;
	private int customerNumber;
	
	public abstract double getSavingsInterest();
	public abstract double getCheckInterest();
	public abstract double getCheckCharge();
	
	
    public Customer(String name, String address, int age, String telephoneNumber, int customerNumber)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.customerNumber = customerNumber;
    }
	
    
    @Override
    public String toString() 
    {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", customerNumber=" + customerNumber +
                '}';
    }

}
