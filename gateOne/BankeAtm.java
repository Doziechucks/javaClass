import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BankeAtm{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random random = new Random();
   
      ArrayList<String> names = new ArrayList<String>();
      ArrayList<String> accountNumbers = new ArrayList<String>();
      ArrayList<String> passWords = new ArrayList<String>();
      ArrayList<Double> balances = new ArrayList<Double>();

      int exitGuy = -1;
      while(exitGuy != 0){
         System.out.println("welcome to bank\"s ATM what would you like to do");
         System.out.println(" would you like to create an account? (enter 1). \n press 0 to quit"); 
         exitGuy = input.nextInt();

         if(exitGuy == 1){
            createAccount();
                 }               
         returnMainMenu();
         exitGuy = input.nextInt();

 
           if(exitGuy == 1){
              createAccount();
         	}
              returnMainMenu();
              exitGuy = input.nextInt();
      
           

           if(exitGuy == 2){ 
              System.out.print("Login your"})
              System.out.print("how much do you want to deposit: ");
              double moneyInput = input.nextDouble();
              balances.add(0, moneyInput);
              System.out.printf("your balance is now: %s%n", balances.get(0));
              returnMainMenu();
                  
		}
           
         }
	
	}
      public static void returnMainMenu(){
         System.out.print("what would you like to do?"); 
         System.out.print("""
1. Create an account with their first name and last name and pin
2. Close account.
3. Deposit money
4. Withdraw money.
5. Check Account balance
6. Transfer from one account to another.
7. Change Pin.
0. to quit
""");}
      public static void createAccount(){
         System.out.print("Enter first name: ");
         String firstName = input.next();

         System.out.print("Enter last name: ");
         String lastName = input.next();

         String fullName = "" + firstName + " " + lastName + "";
         names.add(fullName); 
        
         String accountNumber = "";
         for(int number = 0; number < 10; number++){
            int Number = random.nextInt(9);
            accountNumber = ""+ Number +"";
		}
         accountNumbers.add(accountNumber); 

         System.out.print("Choose a 4 digit password");
         String pass = input.next();
         while (pass.length() != 4){
            System.out.print("Choose a 4 digit password");
            pass = input.next();
          	}
         passWord.add(pass);
         double balance = 0;
         balances.add(balance);
		}
      

      public static void logIn(){
   System.out.print("Enter you Account Number: ");
   int accountNumberCheck = input.nextInt()
   int checker = -1
   for(int number =0; number < accountNumbers.size(); number++){
      if (balances.get(number) == accountNumberCheck){
         checker = number;
		}
	}  
   if (checker == -1){
      System.out.print("Invalid account number");
	}

}     


}

