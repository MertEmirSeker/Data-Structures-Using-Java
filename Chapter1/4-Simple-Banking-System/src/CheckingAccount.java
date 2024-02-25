
public class CheckingAccount extends Account
{
	// constructor
	CheckingAccount(Customer customer, int accountNumber)
	{
		super(customer, accountNumber);
	}
	
	@Override
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	@Override
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	@Override
	public void addInterest(double rate)
	{
		double interest = rate * balance;
		balance += interest;
	}
}
