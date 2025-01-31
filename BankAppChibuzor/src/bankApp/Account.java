package bankApp;

public class Account {
    Bank bank = new Bank();

    private String password;
    private double balance;
    private int index;
    private String fullName;
    private int accountNumber;

    public Account(String fullName, String password, int accountNumber) {
        this.password = password;
        this.fullName = fullName;
        this.accountNumber = accountNumber;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) balance = balance + depositAmount;
        else throw new IllegalArgumentException("Invalid input");
    }

    public void withdraw(double removedAmount) {
        if (removedAmount > 0 && removedAmount <= balance) balance = balance - removedAmount;
        else throw new IllegalArgumentException("Invalid input");
    }
}
