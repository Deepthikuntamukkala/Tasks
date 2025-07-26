class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("IND1001", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}

	
