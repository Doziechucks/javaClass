package bankApp;

public class Account {
    Bank bank = new Bank();

    private String password;
    private double balance;
    private int index;
    private String fullName;
    private String lastName;
    private int accountNumber;

    public Account(String firstName, String lastName, String password, int accountNumber) {
        this.password = password;
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.lastName  = lastName;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(String password) {
        if(passwordCheck(password) == true) return balance;
        else throw new IllegalArgumentException("Incorrect details");
    }
    public boolean passwordCheck(String password){
        if (password == this.password) return true;
        else return false;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0 ) balance = balance + depositAmount;
        else throw new IllegalArgumentException("Invalid input");
    }

    public void withdraw(double removedAmount, String password) {
        if (removedAmount > 0 && removedAmount <= balance && passwordCheck(password) == true) {
            balance = balance - removedAmount;
            System.out.print("withdrawal successful")
        }
        else throw new IllegalArgumentException("Invalid input");
    }
}
