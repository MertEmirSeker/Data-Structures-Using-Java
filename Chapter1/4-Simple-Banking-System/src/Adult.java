
public class Adult extends Customer
{
    public static final double SAVINGS_INTEREST = 0.03;
    public static final double CHECK_INTEREST = 0.02;
    public static final double CHECK_CHARGE = 1.5;
    public static final double OVERDRAFT_PENALTY = 25.0;
    
    public Adult(String name, String address, int age, String telephoneNumber, int customerNumber) 
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
