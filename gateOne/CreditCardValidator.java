import java.util.Arrays;
import java.util.Scanner;
public class CreditCardValidator{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String check = "";
      String cardType = "";

      System.out.print("Enter credit card number: ");
      String numberCC = input.nextLine();
 
      if (numberCC.length() < 13 || numberCC.length() > 16) System.out.print("Invalid card number");
   
      else {
      int[] cardNumber = new int[numberCC.length()];
      System.out.println("************************************************");
      for(int number = 0; number < numberCC.length(); number++){
         cardNumber[number] = numberCC.charAt(number) - '0';
		}  
      if (cardNumber[0] == 4) cardType = "Visa";
      else if(cardNumber[0] == 5) cardType = "Mastercard";
      else if(cardNumber[0] == 3 && cardNumber[1] == 7)cardType = "American Express";
      else if(cardNumber[0] == 6 ) cardType = "Discover cards";
      else cardType = "Invalid Input";
      int total = 0;
      for(int number = 0; number < numberCC.length(); number++){

         
         if (number % 2 == 0){
            int multiple = cardNumber[number] * 2;
            if (multiple > 9){
               int first = multiple % 10;
               int second = multiple / 10;
               total += first + second;
		}
            else total +=  multiple;
			}
         else total += cardNumber[number];
		}
      if(total % 10 == 0) check = "Valid";
      else check = "Invalid";
        	  
      if (cardNumber[0] == 4) cardType = "Visa";
      else if (cardNumber[0] == 5) cardType = "Mastercard";
      else if (cardNumber[0] == 3 && cardNumber[1] == 7) cardType = "American Express";
      else if (cardNumber[0] == 6 ) cardType = "Discover cards";
      else {
         cardType = "Invalid card";
         check = "Invalid";
           }
}
      
      System.out.printf("**Credit Card Type: %s%n", cardType);
      System.out.printf("**Credit Card Number: %s%n", numberCC);
      System.out.printf("**Credit Card Digit: %s%n", numberCC.length());
      System.out.printf("**Credit Card Validity: %s%n", check);
      System.out.print("************************************************");
      

	}
} 