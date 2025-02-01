package bankApp;

import java.util.ArrayList;

public class Bank{
    public ArrayList<String> accountNumbers = new ArrayList<String>();
    public ArrayList<String> firstNames = new ArrayList<String>();
    public ArrayList<String> lastNames = new ArrayList<String>();
    private ArrayList<String> passwords= new ArrayList<String>();
    public ArrayList<Double> balances = new ArrayList<Double>();
    private int index;
    private String password;
    private double balance;
    private String fullName;
    private String lastName;
    private int accountNumber;

    Account account = new Account();

    public String getPassword(int index){
        return passwords.get(index);
    }

    public void addAccount(String accountnumber, String password, String firstName, String lastName){
        accountNumbers.add(accountnumber);
        passwords.add(password);
        firstNames.add(firstName);
        lastNames.add(lastName);

    }

    public String getAccountNumber(int index){
        return accountNumbers.get(index);
        }

    public int getIndex(String accountNumber){

        for(int number = 0; number < accountNumbers.size(); number++){
            if(accountNumber.equals(accountNumbers.get(number))) {
                index = number;
                return index;
            }
        }
         throw new IllegalArgumentException("Incorrect details");
    }

    public void withdraw(double money, String pass) {
        account.withdraw(money, pass);
    }
    public void deposit(double money) {
        account.deposit(money);
}
