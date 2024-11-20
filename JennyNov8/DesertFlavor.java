import java.util.Scanner;

public class DesertFlavor{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("what desert will you be having(ice cream, sundae, shake): ");
      String de = input.nextLine();
      String desert = de.toUpperCase();
      switch(desert){
    
         case "ICE CREAM":
         System.out.print("which flavor would you prefer(chocolate, vanilla, strawberry): ");
         String ic = input.nextLine();
            String icecream = ic.toUpperCase();
            switch(icecream){
               
               case "CHOCOLATE":
               System.out.println("chocolate flavor Ice cream ");
               break; 

               case "VANILLA":
               System.out.println("vanilla Ice cream ");
               break; 

               case "STRAWBERRY":
               System.out.println("Strawberry ice cream"); 
               break; 
                                   }
         break;
         case "SUNDAE":
         System.out.print("which flavor would you prefer(chocolate, vanilla, strawberry): ");
         String se = input.nextLine();
            String sundae = se.toUpperCase();
            switch(sundae){

               case "CHOCOLATE":
               System.out.println("chocolate flavor Sundae ");
               break; 

               case "VANILLA":
               System.out.println("vanilla flavor Sundae ");
               break; 

               case "STRAWBERRY":
               System.out.println("Strawberry flavor Sundae"); 
               break; 
                                   }
          break;

         case "SHAKE":
         System.out.print("which flavor would you prefer(chocolate, vanilla, strawberry): ");
         String sk = input.nextLine();
            String shake = sk.toUpperCase();
            switch(shake){
               
               case "CHOCOLATE":
               System.out.println("chocolate flavor shake ");
               break; 

               case "VANILLA":
               System.out.println("vanilla flavor Shake ");
               break; 

               case "STRAWBERRY":
               System.out.println("Strawberry flavor Shake"); 
               break; 
                                   }
          break;
    
    
    }
}
}