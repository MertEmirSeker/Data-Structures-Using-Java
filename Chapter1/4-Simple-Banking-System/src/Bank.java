import java.util.Arrays;

public class Bank
{
    private Account[] accounts;
    private int accountCount;
    
    // constructor
    public Bank()
    {
    	this.accounts = new Account[100];
    	this.accountCount = 0;
    }
    
    // Method to reallocate accounts array
    private void reallocate() 
    {
        accounts = Arrays.copyOf(accounts, accounts.length * 2);
    }
    
    // Method to add account
    public void addAccount(Account account) 
    {
        if (accountCount == accounts.length) 
        	reallocate();
        
        accounts[accountCount++] = account;
    }
    
    public void makeDeposit(int accountNumber, double amount) 
    {
        // Find account
        for (int i = 0; i < accountCount; i++) 
        {
            if (accounts[i].getAccountNumber() == accountNumber)
            {
                // Check if transactions array is null
                if (accounts[i].getTransactions() == null) 
                {
                    // Initialize transactions array
                    accounts[i].initTransactions();
                }
                // Make deposit
                accounts[i].deposit(amount);
                break;
            }
        }
    }

    public void makeWithdrawal(int accountNumber, double amount)
    {
        // Find account
        for (int i = 0; i < accountCount; i++) 
        {
            if (accounts[i].getAccountNumber() == accountNumber) 
            {
                // Check if transactions array is null
                if (accounts[i].getTransactions() == null) 
                {
                    // Initialize transactions array
                    accounts[i].initTransactions();
                }
                // Make withdrawal
                accounts[i].withdraw(amount);
                break;
            }
        }
    }

    
    // Method to get account
    public Account getAccount(int accountNumber) 
    {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) 
            {
                return accounts[i];
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bank Accounts:\n");
        for (int i = 0; i < accountCount; i++) {
            sb.append(accounts[i].toString()).append("\n\n");
        }
        return sb.toString();
    }

}
