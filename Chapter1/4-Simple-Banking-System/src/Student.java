
public class Student extends Customer
{
    public static final double SAVINGS_INTEREST = 0.07;
    public static final double CHECK_INTEREST = 0.04;
    public static final double CHECK_CHARGE = 0.5;
    public static final double OVERDRAFT_PENALTY = 10.0;
    
    public Student(String name, String address, int age, String telephoneNumber, int customerNumber) 
    {
        super(name, address, age, telephoneNumber, customerNumber);
    }
    
    public double getSavingsInterest() 
    {
        return SAVINGS_INTEREST;
    }
    
    public double getCheckInterest() 
    {
        return CHECK_INTEREST;
    }
    
    public double getCheckCharge() 
    {
        return CHECK_CHARGE;
    }
}
