
public class SavingsAccount extends Account
{
	
	// constructor
	SavingsAccount(Customer customer, int accountNumber)
	{
		super(customer, accountNumber);
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void addInterest(double rate)
	{
		double interest = rate * balance;
		balance += interest;
	}
}
