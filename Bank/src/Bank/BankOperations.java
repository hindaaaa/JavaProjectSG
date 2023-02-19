package Bank;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BankOperations {
	
	    private String accountNumber;
	    private double balance;
	    private ArrayList<BankOP> transactions;

	    public BankOperations(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	        this.transactions = new ArrayList<BankOP>();
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        BankOP transaction = new BankOP(new Date(), amount, balance, "Deposit");
	        transactions.add(transaction);
	        System.out.println("Deposited " + amount + " to account " + accountNumber + ". New balance is " + balance);
	    }

	    public void withdraw(double amount) throws Exception {
	        if (amount > balance) {
	            throw new Exception("Withdrawal amount exceeds account balance");
	        }
	        balance -= amount;
	        BankOP transaction = new BankOP(new Date(), amount, balance, "Withdrawal");
	        transactions.add(transaction);
	        System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance is " + balance);
	    }
	        public void printStatement() {
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	            String TOP = "-------------------------------------------\n" +
	                            "           Societe Generale Bank           \n" +
	                            "-------------------------------------------\n" +
	                            "Statement for account " + accountNumber + "\n" +
	                            "-------------------------------------------\n" +
	                            "Date                Amount        Balance  \n" +
	                            "-------------------------------------------\n";

	            String DOWN = "-------------------------------------------\n" +
	                            "End of statement for account " + accountNumber + "\n" +
	                            "-------------------------------------------\n";

	            StringBuilder statement = new StringBuilder();
	            statement.append(TOP);

	            for (BankOP transaction : transactions) {
	                String formattedDate = dateFormat.format(transaction.getDate());
	                String formattedAmount = String.format("%10.2f", transaction.getAmount());
	                String formattedBalance = String.format("%10.2f", transaction.getBalance());

	                statement.append(formattedDate)
	                         .append("  ")
	                         .append(formattedAmount)
	                         .append("     ")
	                         .append(formattedBalance)
	                         .append("\n");
	            }

	            statement.append(DOWN);

	            System.out.println(statement.toString());
	        }





	}


