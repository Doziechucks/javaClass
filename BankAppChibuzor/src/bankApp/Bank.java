package bankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private int accountNumber;


    public Bank() {
        accounts = new ArrayList<>();
        this.accountNumber = accountNumber;

    }



    public void createAccount(String password, String firstName, String lastName) {
        Account account = new Account(firstName, lastName, password, ++accountNumber);
        if(password.isEmpty()) throw new IllegalArgumentException("Invalid password input");
        if(firstName.isEmpty()) throw new IllegalArgumentException("Invalid first name");
        if(lastName.isEmpty()) throw new IllegalArgumentException("Invalid second name");
        accounts.add(account);
    }

    public boolean accountCheck(int accountNumba) {
        int index = 0;
        for (int number = 0; number < accounts.size(); number++) {
            if (accounts.get(number).getAccountNumber() == accountNumba) {
                return true;
            }

        }
        return false;
    }


    public int findAccount(int accountNumba){
        int index = 0;
        for(int number = 0; number < accounts.size(); number++){
            if (accounts.get(number).getAccountNumber() == accountNumba) {
                index =  number;
                return index;
            }
        }
        return -1;
    }

    public void deposit(int accoutNumber, double amount){
        if(findAccount(accoutNumber) == -1)  throw new IllegalArgumentException("invalid account Number");
        else accounts.get(findAccount(accoutNumber)).deposit(amount);

    }


    public double getBalance(int accountNumber, String password) {
        return accounts.get(findAccount(accountNumber)).getBalance(password);
    }

    public void withdraw(String password, int accountNumber, double amount) {
        accounts.get(findAccount(accountNumber)).withdraw(password, amount);
    }

    public void transfer(int accountNumberOne, String password, double amount, int accountNumberTwo ) {
        accounts.get(findAccount(accountNumberOne)).withdraw(password, amount);
        accounts.get(findAccount(accountNumberTwo)).deposit(amount);
    }
}
