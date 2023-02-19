package Bank;

public class BankManagement {
	
	    public static void main(String[] args) {
	      
	    	BankOperations account = new BankOperations("123456789", 1000.0);

	    	BankOperations account1 = new BankOperations("16789", 5000.0);
	     
	        account.deposit(1000.0);
	        account1.deposit(1000.0);

	      
	        try {
	            account.withdraw(50.0);
	        } catch (Exception e) {
	            System.out.println("Failed to withdraw: " + e.getMessage());
	        }
	        try {
	            account1.withdraw(5000.0);
	        } catch (Exception e) {
	            System.out.println("Failed to withdraw: " + e.getMessage());
	        }


	      
	        account.printStatement();
	        account1.printStatement();
	    }
	}


