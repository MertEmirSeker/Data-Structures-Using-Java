
public class Senior extends Customer
{
    public static final double SAVINGS_INTEREST = 0.05;
    public static final double CHECK_INTEREST = 0.03;
    public static final double CHECK_CHARGE = 1.0;
    public static final double OVERDRAFT_PENALTY = 20.0;
    
    public Senior(String name, String address, int age, String telephoneNumber, int customerNumber) 
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
