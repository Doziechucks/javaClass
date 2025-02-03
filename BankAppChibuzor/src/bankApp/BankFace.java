package bankApp;
import java.text.ParseException;
import java.util.Scanner;

public class BankFace {
    static Bank bank = new Bank();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        userOptions();
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> createAccount();
            case 2 -> deposit();

        }

    }

    private static void deposit() {
        print("Enter account number: ");
        String accountNumber = input.nextLine();
        try{
            int accountNumba = Integer.parseInt(accountNumber);
        }
        catch(NumberFormatException e) {
            print("Enter account number: ");
            accountNumber = input.nextLine();

        }


    }

    public static void userOptions() {
        print("""
                welcome to Mr Chi's Bank
                1. create account
                2. deposit
                3. withdraw
                4. Transfer
                5. change Pin
                6. change details
                7. quit: 
                """);


    }
    public static void print(String text){
        System.out.println(text);
    }

    private static void createAccount() {
        print("Enter first name");
        String firstName = input.next();
        print("Enter lastname name");
        String lastName = input.next();
        String pin = "";
        int check = 0;
        while(check == 0) {
            print("Enter a four digit pin");
            pin = input.next();
            if (pin.isEmpty() == false && pin.length() == 4 && pin.contains(" ") == false) check = 1;
            else check = 0;
        }
        bank.createAccount(firstName, lastName, pin);
        System.out.printf("account created successfully");

    }

}