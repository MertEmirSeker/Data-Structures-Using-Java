import java.util.Arrays;

public class Account
{
	
	protected Customer customer;
	protected double balance;
	protected int accountNumber;
	protected Transaction[] transactions;
	protected int transactionCount;
	
	// constructor
	public Account(Customer customer, int accountNumber)
	{
		this.customer = customer;
		this.accountNumber = accountNumber;
		this.balance = 0.0;
		this.initTransactions();
		this.transactionCount = 0;
	}
	
	// getters
	public Customer getCustomer()
	{
		return customer;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	// setter
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	
	public void reallocate()
	{
        transactions = Arrays.copyOf(transactions, transactions.length * 2);
	}
	
	@Override
	public String toString() 
	{
	    return "Account{customer=" + customer.toString() +
	            ", balance=" + balance +
	            ", accountNumber=" + accountNumber +
	            ", transactions=" + Arrays.toString(transactions) +
	            '}';
	}

	
    public void addTransaction(Transaction transaction) 
    {
        if (transactionCount == transactions.length) 
            	reallocate();
        
        transactions[transactionCount++] = transaction;
    }

    
	public void deposit(double amount) 
	{
		// TODO Auto-generated method stub
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

	public Transaction[] getTransactions() 
	{
	    return transactions;
	}

	public void initTransactions() 
	{
	    transactions = new Transaction[20]; 
	}


}
