package Bank;

import java.util.Date;

public class BankOP {
	
        private Date date;
        private double amount;
        private double balance;
        private String operation;

        public BankOP(Date date, double amount, double balance, String operation) {
            this.date = date;
            this.amount = amount;
            this.balance = balance;
            this.operation = operation;
        }

        public Date getDate() {
            return date;
        }

        public double getAmount() {
            return amount;
        }

        public double getBalance() {
            return balance;
        }

        public String getOperation() {
            return operation;
        }
    }




