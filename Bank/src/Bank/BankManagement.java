package Bank;

public class BankManagement {
	
	    public static void main(String[] args) {
	      
	        BankOperations account = new BankOperations("123456789");

	     
	        account.deposit(1000.0);

	      
	        try {
	            account.withdraw(50.0);
	        } catch (Exception e) {
	            System.out.println("Failed to withdraw: " + e.getMessage());
	        }

	        
	        try {
	            account.withdraw(75.0);
	        } catch (Exception e) {
	            System.out.println("Failed to withdraw: " + e.getMessage());
	        }

	      
	        account.printStatement();
	    }
	}


