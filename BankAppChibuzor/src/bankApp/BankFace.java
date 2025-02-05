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
            case 3 -> withdraw();
        }

    }

    private static void deposit() {
        try {
            int accountNumberInput = accountTry();
            double inputAmount = amountTry(2);
            bank.deposit(accountNumberInput, inputAmount);
            print("you have successfully deposited " + inputAmount);
            bankStart();
        }catch(Exception e){
            System.out.println("Invalid Inputs");
        }
        bankStart();
    }

    public static String amountPrompt(){
        print("enter amount to deposit: ");
        String enterAmount = input.nextLine();
        return enterAmount;
    }

    public static String amountPromptTwo(){
        print("enter amount to withdraw: ");
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

    private static void withdraw() {

        int accountNumberInput = accountTry();
        double inputAmount = amountTry(3);
        String pass = pinPrompt();
        bank.withdraw(pass, accountNumberInput, inputAmount);
        print("withdrawal of " + inputAmount + "successful");
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
    public static double amountTry(int choice){
        double amount = 0;
        boolean check = true;
        String enterAmount = "";
        switch (choice){
            case 2-> enterAmount = amountPrompt();
            case 3-> enterAmount = amountPromptTwo();
        }
        while (check == true){
            try {
                amount = Double.parseDouble(enterAmount);
                check = false;
            } catch (Exception e) {
                System.out.println("Invalid input");
                switch (choice){
                    case 2-> enterAmount = amountPrompt();
                    case 3-> enterAmount = amountPromptTwo();
                }
                ;

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

    public static String pinPrompt(){
        print("Enter your pin: ");
        String pin  = input.nextLine();
        return pin;
    }

}