import java.util.Scanner;
public class SimpleBankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      Bank bank = new Bank();

	        // Sample data
	        Customer customer1 = new Senior("John Doe", "123 Main St", 65, "555-1234", 1);
	        Customer customer2 = new Adult("Jane Smith", "456 Elm St", 40, "555-5678", 2);
	        Customer customer3 = new Student("Bob Johnson", "789 Oak St", 20, "555-9012", 3);

	        Account account1 = new SavingsAccount(customer1, 101);
	        Account account2 = new CheckingAccount(customer2, 102);
	        Account account3 = new SavingsAccount(customer3, 103);

	        bank.addAccount(account1);
	        bank.addAccount(account2);
	        bank.addAccount(account3);

	        // Interact with the user
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("1. Make a deposit");
	            System.out.println("2. Make a withdrawal");
	            System.out.println("3. Show Bank Accounts");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter account number: ");
	                    int accountNumber = scanner.nextInt();
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    bank.makeDeposit(accountNumber, depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter account number: ");
	                    accountNumber = scanner.nextInt();
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawalAmount = scanner.nextDouble();
	                    bank.makeWithdrawal(accountNumber, withdrawalAmount);
	                    break;
	                case 3:
	        	        System.out.println(bank.toString());
	                	break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 3);
	        
	}

}
