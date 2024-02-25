import java.util.Date;

public class Transaction
{
	private int customerNumber;
	private String transactionType;
	private double amount;
	private Date date;
	private String fees;
	
	// constructor
	public Transaction(int customerNumber, String transactionType, double amount, Date date, String fees)
	{
		this.customerNumber = customerNumber;
		this.transactionType = transactionType;
		this.amount = amount;
		this.date = date;
		this.fees = fees;
	}
	
	public void processTran()
	{
		
	}

	
	// getters
	public int getCustomerNumber()
	{
		return customerNumber;
	}

	public String getTransactionType()
	{
		return transactionType;
	}

	public double getAmount()
	{
		return amount;
	}

	public Date getDate()
	{
		return date;
	}

	public String getFees()
	{
		return fees;
	}
}
