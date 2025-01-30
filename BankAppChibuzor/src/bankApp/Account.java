package bankApp;

public class Account {
    Bank bank = new Bank();

    private String password;
    private Double balance;
    private int index;
    private String accountNumber;



    public Double getBalance(String accountNumber, String Password) {
        if (numberCheck(accountNumber) == true && passwordCorrect(Password) == true){
            return balance;
        }
        else throw new IllegalArgumentException("Incorrect details");
    }

    public boolean numberCheck(String accountNumber) {
        for(int number = 0; number < bank.accountNumbers.size(); number++){
            if(accountNumber == bank.accountNumbers.get(number)){
                index = number;
                return true;

            }
        }
        return false;
    }
    public void setACcounNumber(){
        accountNumber = bank.accountNumbers.get(index);
    }

    private boolean passwordCorrect(String password) {
        if (this.password == password) return true;
        else return false;
    }
    private void setPassword(){this.password = bank.getPassword(index);}

}
