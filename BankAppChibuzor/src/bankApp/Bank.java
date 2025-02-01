package bankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private int accoutnNumber;


    public Bank() {
        accounts = new ArrayList<>();
    }




    public String getPassword(int index) {
        return passwords.get(index);
    }

    public void createAccount(String password, String firstName, String lastName) {
        Account account = new Account(firstName, lastName, password, ++accoutnNumber);
        if(password.isEmpty()) throw new IllegalArgumentException("ivalid password")
        accounts.add(account);

    }

    public int getAccountNumber(int index) {
        return accountNumbers.get(index);
    }

    public int getIndex(int accountNumber) {

        for (int number = 0; number < accountNumbers.size(); number++) {
            if (accountNumber == accountNumbers.get(number)) {
                index = number;
                return index;
            }
        }
        throw new IllegalArgumentException("Incorrect details");
    }

    public void withdraw(int accountNumber, double money, String pass) {
        account.withdraw(accountNumber, money, pass);
    }

    public void deposit(int accountNumber, double money) {
        account.deposit(accountNumber, money);
    }

    public void transfer(int accountNumber1, String password1, double amount, int accountNumber2) {
        Bank bank = new Bank();
        bank.withdraw(accountNumber1, amount, password1);
        bank.deposit(accountNumber2, amount);
    }

    public double getBalance(int accountNumber, String password) {
        return account.getBalance(accountNumber, password);
    }
}
