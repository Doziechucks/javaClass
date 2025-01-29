package bankApp;

public class Account {
    Bank bank = new Bank();

    private String password;
    private Double balance;
    private int index;



    public Double getBalance(int accountNumber, String Password) {
        if (numberCheck(accountNumber) == true && passwordCorrect(Password) == true){
            return balance;
        }
        else throw new IllegalArgumentException("Incorrect details");
    }

    private boolean numberCheck(int accountNumber) {
        for(int number = 0; number < bank.accountNumbers.size(); number++){
            if(bank.accountNumbers[number] == accountNumber){
                index = number;
                return true;
                break;
            }
        }
        return false;
    }

    private boolean passwordCorrect(String password) {
        if (this.password == password) return true;
        else return false;
    }
    private void setPassword(){this.password = bank.passwords[index]}

}
