import java.util.Scanner;

public class JobDescription{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter job: IT HR or Finance: ");
      String chosenJob = input.nextLine();
      String chosen = chosenJob.toUpperCase();
      switch(chosen){
    
         case "HR":
         System.out.println("Manager, Analyst or Intern: ");
         String hr = input.nextLine();
            String humanR = hr.toUpperCase();
            switch(humanR){
               
               case "MANAGER":
               System.out.println("Manager");
               break; 

               case "ANALYST":
               System.out.println("Analyst");
               break; 

               case "INTERN":
               System.out.println("Intern"); 
               break; 
                                   }
         break;
         case "IT":
         System.out.println("Manager, Analyst or Intern: ");
         String it = input.nextLine();
            String iTech = it.toUpperCase();
            switch(iTech){
               case "MANAGER":
               System.out.println("Manager"); 
               break; 

               case "ANALYST":
               System.out.println("Analyst"); 
               break; 

               case "INTERN":
               System.out.println("Intern"); 
               break; 
                                   }
          break;

         case "FINANCE":
         System.out.println("Manager, Analyst or Intern: ");
         String fi = input.nextLine();
            String finance = fi.toUpperCase();
            switch(finance){
               
               case "MANAGER":
               System.out.println("Manager"); 
               break; 

               case "ANALYST":
               System.out.println("Analyst");
               break; 

               case "INTERN":
               System.out.println("Intern"); 
               break; 
                                   }
          break;
    
    
    }
}
}