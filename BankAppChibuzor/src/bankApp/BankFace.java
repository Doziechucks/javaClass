package bankApp;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankFace {
    static Bank bank = new Bank();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        print("welcome to Mr Chi's Bank");

        bankStart();

        }

    public static void bankStart(){
        userOptions();
        int userInput = input.nextInt();
        input.nextLine();
        switch (userInput) {
            case 1 -> createAccount();
            case 2 -> deposit();
        }

    }

    private static void deposit() {
        int accountNumberInput = accountTry();;
        double inputAmount = amountTry();
        bank.deposit(accountNumberInput, inputAmount);
        print("you have successfully deposited "+ inputAmount);
        bankStart();
    }

    public static String amountPrompt(){
        print("enter aamount to deposit: ");
        String enterAmount = input.nextLine();
        return enterAmount;
    }


    public static String promptAccount(){
        print("enter account number: ");
        String accountNumber = input.nextLine();
        return accountNumber;
    }

    public static void userOptions() {
        print("""
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
        bankStart();
    }
    public static double amountTry(){
        boolean check = true;
        double amount = 0;
        String enterAmount = amountPrompt();
        while (check == true){
            try {
                amount = Double.parseDouble(enterAmount);
                check = false;
            } catch (Exception e) {
                System.out.println("Invalid input");
                enterAmount = amountPrompt();
            }
        }
        return amount;
    }

    public static int accountTry(){
        String account = promptAccount();
        boolean repeat = true;
        int number = 0;
        while (repeat == true) {
            try {
                number = Integer.parseInt(account);
                repeat = false;
            } catch (Exception e) {
                System.out.println("Invalid input");
                account = promptAccount();
            }
        }
        return number;
    }

}