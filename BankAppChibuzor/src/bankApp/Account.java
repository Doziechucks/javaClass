package bankApp;

public class Account {

    private String password;
    private double balance;
    private String firstName;
    private String lastName;
    private int accountNumber;

    public Account(String firstName, String lastName, String password, int accountNumber) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }


    public double getBalance(String password) {
        if(this.password != password) throw new IllegalArgumentException("Invalid Password");
        if(password.isEmpty()) throw new IllegalArgumentException("Password is empty");
        return balance;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Invalid amount");
        this.balance += amount;
    }

    public void withdraw(String password, double amount){
        if(this.password != password) throw new IllegalArgumentException("Invalid Password");
        if(password.isEmpty()) throw new IllegalArgumentException("Password is empty");
        if(amount <= 0 || amount > balance) throw new IllegalArgumentException("Invalid amount");
        balance -= amount;

    }

    public void updatePin(String oldPin, String newPin){
        if(this.password != oldPin) throw new IllegalArgumentException("Invalid Password");
        if(newPin.isEmpty()) throw new IllegalArgumentException("Password is empty");
        password = newPin;
    }

}
