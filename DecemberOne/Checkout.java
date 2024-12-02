import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class Checkout{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Date myTime = new Date();
      String choice;
      int amount;
      int total = 0;
      int count = 0;
      int totalTwo = 0;
      System.out.print("customer's name: ");
      String cus = input.next();
      ArrayList<String> items = new ArrayList<String>();
      ArrayList<Integer> prices = new ArrayList<Integer>();
      ArrayList<Integer> quantity = new ArrayList<Integer>();
      ArrayList<Integer> amounts = new ArrayList<Integer>();
      do{ 

          System.out.print("what did user buy: ");
          String userItem = input.next();
          items.add(userItem);   

          System.out.print("how many pieces: ");
          int userInput = input.nextInt();
          quantity.add(userInput);

          
          System.out.print("How much per unit: ");
          int userPrice = input.nextInt();
          prices.add(userPrice);
          
          
 
          amount = userInput * userPrice;
          amounts.add(amount);

          total = total + amount;
          
          System.out.print("do you want another item: ");
          choice = input.next(); 

          while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("No")){
             System.out.println("Invalid Input(yes or no)");
             System.out.print("do you want another item: ");
             choice = input.next(); 
	}
          amount = 0;   
          count++;
          

}
          while(!choice.equalsIgnoreCase("No"));

          System.out.println("Enter Cashier name: ");
          String cashierName = input.next();
      
     
         System.out.print("SEMICOLON STORES \nMAIN BRANCH \nLOCATION: HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: 03293828343\n");
         System.out.println("Date: " + myTime +"");
         System.out.printf("Cashier's name: %s \nCustomer's name: %s \n ===========================================================\n\n                      item   qty      price      total(ngn)\n\n -----------------------------------------------------------\n", cashierName, cus);	  	

          for (int number = 0; number < count; number++){
             System.out.printf("                      %s     %d        %d           %d", items.get(number), prices.get(number), quantity.get(number), amounts.get(number)); 
             System.out.println(); 
             totalTwo = totalTwo + amounts.get(number);
		}
             double discount = totalTwo * 0.08;
             double vat = totalTwo * 0.075;
             double billTotal = totalTwo - discount + vat;
 
          System.out.printf("\n------------------------------------------------------------\n                sub Total: %d \n                 Discount: %f \n                 VAT: %g \n\n============================================================\n\n                Bill Total: %g \n\n ===========================================================\n\n THIS IS NOT A RECEIPT KINDLY PAY %gNaira  \n\n ===========================================================\n",totalTwo, discount, vat, billTotal, billTotal);

         System.out.println("How much did customer pay: ");
         double customerDeposit = input.nextInt();

         double balance = customerDeposit -  billTotal;   

         System.out.print("SEMICOLON STORES \nMAIN BRANCH \nLOCATION: HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: 03293828343\n");
         System.out.println("Date: " + myTime +"");
         System.out.printf("Cashier's name: %s \nCustomer's name: %s \n ===========================================================\n\n                      item   qty      price      total(ngn)\n\n -----------------------------------------------------------\n", cashierName, cus); 
          
          for (int number = 0; number < count; number++){
          System.out.printf("                      %s     %d        %d           %d", items.get(number), prices.get(number), quantity.get(number), amounts.get(number));
          System.out.println();  
	}

          System.out.printf("\n------------------------------------------------------------\n                sub Total: %d \n                 Discount: %f \n                 VAT: %g \n\n============================================================\n\n                Bill Total: %g \n               Customers Deposit: %g\n              Balance: %g \n===========================================================\n\n THANK YOU FOR YOUR PATRONAGE  \n\n ===========================================================\n",totalTwo, discount, vat, billTotal, customerDeposit, balance);


	}
}