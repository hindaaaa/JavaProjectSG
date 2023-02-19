package Bank;

import java.util.ArrayList;
import java.util.Date;

public class BankOperations {
		private String accountNumber;
	    private double balance;
	    private ArrayList<BankOP> transactions;

	    public BankOperations(String accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0.0;
	        this.transactions = new ArrayList<BankOP>();
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        BankOP transaction = new BankOP(new Date(), amount, balance, "deposit");
	        transactions.add(transaction);
	        System.out.println("Deposited " + amount + " to account " + accountNumber + ". New balance is " + balance);
	    }

	    public void withdraw(double amount) throws Exception {
	        if (amount > balance) {
	            throw new Exception("Withdrawal amount exceeds account balance");
	        }
	        balance -= amount;
	        BankOP transaction = new BankOP(new Date(), amount, balance, "withdrawal");
	        transactions.add(transaction);
	        System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance is " + balance);
	    }

	    public void printStatement() {
	        System.out.println("Statement for account " + accountNumber);
	        System.out.println("Date\t\tAmount\tBalance\tOperation");
	        for (BankOP transaction : transactions) {
	            System.out.println(transaction.getDate() + "\t" + transaction.getAmount() + "\t" + transaction.getBalance() + "\t" + transaction.getOperation());
	        }
	    }}

