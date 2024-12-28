import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BankeAtm{
   private static Scanner input = new Scanner(System.in);
   private static Random random = new Random();
   
   static ArrayList<String> names = new ArrayList<String>();
   static ArrayList<String> accountNumbers = new ArrayList<String>();
   static ArrayList<String> passWords = new ArrayList<String>();
   static ArrayList<Double> balances = new ArrayList<Double>();
   private static int checker = 0;

   public static void main(String[] args){
   

      int exitGuy = -1;
      while(exitGuy != 0){
         returnMainMenu();
         exitGuy = input.nextInt();

         if(exitGuy == 1){
            createAccount();
                 }    
         
 
         else if(exitGuy == 2){
            if(logIn() == checker){
               System.out.printf("Welcome: %s%n", names.get(checker));
               passWords.remove(checker);
               accountNumbers.remove(checker);
               names.remove(checker);
               System.out.printf("Take your left over of %g%n", balances.get(checker));
               balances.remove(checker);
		}
            else returnMainMenu();
	}
              
         	
 
         else if(exitGuy == 3){ 
            int number = 0;
            int indexCheck = -1;
            System.out.print(accountNumbers);
            System.out.print("Enter account number you are depositing to: ");
            String depositCheck = input.next();
            for(number = 0; number < accountNumbers.size(); number++) {
               if(depositCheck.equals(accountNumbers.get(number))){
                  indexCheck = number;
                  System.out.print("account name is: ");
                  System.out.println(names.get(indexCheck));
			} 
		}

            while (indexCheck == -1){
            System.out.print("Invalid account number, enter account number you are depositing to or -2 to quit: "); 
            depositCheck = input.next(); 
            if(depositCheck.equals('0')) returnMainMenu();
            for(number = 0; number < accountNumbers.size(); number++) {
               if (depositCheck.equals( accountNumbers.get(number) ) ) {
                  indexCheck = number;
            		}
		}  
	}	
            if(indexCheck == -2) returnMainMenu();
            else {
               System.out.print(" how much do you want to deposit: ");
               double moneyInput = input.nextDouble();
               if (moneyInput > 0){
                  balances.set(indexCheck, balances.get(indexCheck) + moneyInput);
                  System.out.printf("Deposit Successful. \n\n");
				}
               else System.out.print("Invalid input");
                		}
                  	}
		
            
          else if (exitGuy == 4){
             if(logIn() == checker){
                System.out.printf("Welcome: %s%n", names.get(checker));
		System.out.print("How much do you want to withdraw: ");
                double withdrawal = input.nextInt();
                if (withdrawal > 0 && withdrawal < balances.get(checker)){
                   balances.set(checker, balances.get(checker) - withdrawal);
                   System.out.printf("withdrawal successful, your new balance is: %g%n%n%n: ",balances.get(checker));
					} 
                else System.out.print("Invalid amount");
				   
             			}
               else returnMainMenu();

		}
          else if (exitGuy == 5){
	     if(logIn() == checker){
                System.out.printf("Welcome: %s%n", names.get(checker));
                System.out.printf("your account balance is: %g%n%n", balances.get(checker));
			}
             else returnMainMenu();
	  	}

          else if (exitGuy == 6){
             if(logIn() == checker){
                System.out.printf("Welcome: %s%n", names.get(checker));
                int number = 0;
                int indexCheck = -1;
                System.out.print(accountNumbers);
                System.out.print("Enter account number you are Transferring to: ");
                String depositCheck = input.next();
                for(number = 0; number < accountNumbers.size(); number++) {
                   if(depositCheck.equals(accountNumbers.get(number))){
                      indexCheck = number;
                      
		 	} 
		}
             while (indexCheck == -1){
                System.out.print("Invalid account number, enter account number you are depositing to or -2 to quit: "); 
                depositCheck = input.next(); 
                if(depositCheck.equals('-2')) returnMainMenu();
                for(number = 0; number < accountNumbers.size(); number++) {
                   if ( depositCheck.equals( accountNumbers.get(number) ) ) {
                      indexCheck = number;
             		}
 		}  
 	}	
             if(indexCheck == -2) returnMainMenu();
             else {
                System.out.print("Account number of ");
                System.out.println(names.get(indexCheck));
                System.out.print(" how much do you want to Transfer: ");
                double moneyInput = input.nextDouble();
                if (moneyInput > 0 && moneyInput < balances.get(checker)){
                   balances.set(indexCheck, balances.get(indexCheck) + moneyInput);
                   balances.set(checker, balances.get(checker) - moneyInput);
                   System.out.printf("Transfer successful, your new balance is: %g%n%n%n: ", balances.get(checker)); 
					}
                else System.out.println("Transfer failed due to an invalid input");               
	 				
	 			}
 
 
			}
             else returnMainMenu();
		}

          else if (exitGuy == 7){
             if(logIn() == checker){
                 System.out.print("Enter a new 4 digit password: ");
                 String newPassword = input.next();
                 while(newPassword.length() != 4){
                    System.out.print("Choose a 4 digit password");
                       newPassword = input.next();
				}     
                 passWords.set(checker, newPassword);
                 System.out.print("pin change Successful");
			}             
	     else returnMainMenu();
		}
	}	
          
          
}     

      public static void returnMainMenu(){
         System.out.println("what would you like to do?"); 
         System.out.println("""
1. Create an account with their first name and last name and pin
2. Close account.
3. Deposit money
4. Withdraw money.
5. Check Account balance
6. Transfer from one account to another.
7. Change Pin.
0. to quit
\n\n""");}


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
            accountNumber = accountNumber + Number +"";
		}
         accountNumbers.add(accountNumber); 
         System.out.printf("Your account number is %s%n", accountNumber);
         System.out.print("Choose a 4 digit password: ");
         String pass = input.next();
         while (pass.length() != 4){
            System.out.print("Choose a 4 digit password");
            pass = input.next();
          	}
         passWords.add(pass);
         double balance = 0;
         balances.add(balance);
         accountNumber = "";
         pass = "";
		}
               

      public static int logIn(){

         System.out.print("Enter you Account Number: ");
         String accountNumberCheck = input.next();
         int checker = -1;
         for(int number = 0; number < accountNumbers.size(); number++){
               if(accountNumbers.get(number).equals(accountNumberCheck)){
                  checker = number;   
		  }
		} 
         while(checker == -1) {
            System.out.print("Invalid account number, check and try again(or enter 0 to quit): ");
            accountNumberCheck = input.next();
            if(accountNumberCheck.equals("0")) return -1;
            for(int number = 0; number < accountNumbers.size(); number++){
               if (accountNumbers.get(number).equals(accountNumberCheck)){
                  checker = number;  
			  }
        	}
       
	 }
	
         System.out.print("Enter password: ");
         String passwordCheck = input.next();
         while (!passwordCheck.equals(passWords.get(checker))) {
            System.out.print("password is not matching account number, try again(0 to return to main menu): ");
            passwordCheck = input.next();
            if(passwordCheck == "0"){
               return -1;
			}
         
         	}
         return checker;
	}     



}

