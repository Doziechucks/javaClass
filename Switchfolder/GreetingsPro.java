import java.util.Scanner;

public class GreetingsPro{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("Enter \n 1. For greeting in English \n 2. For greeting in Yoruba \n 3. For greeting in Igbo");
      int userInput = input.nextInt();
      
      switch(userInput){
      
      case 1:
      System.out.println(" 1. morning, \n 2. Afternoon or\n 3. night ");
      int dayTime = input.nextInt();
      
         switch(dayTime){
         
         case 1:
         System.out.println("Good morning");
         break;

	 case 2:
         System.out.println("Good Afternoon");
         break;
   
	 case 3:
   	 System.out.println("Good Night");
         break;
            }
      break;      
	
      case 2:
      System.out.println(" 1. morning, \n 2. Afternoon or\n 3. night ");
      int yorubaTime = input.nextInt();
      switch(yorubaTime){
         
         case 1:
         System.out.println("Eka ro");
         break;

	 case 2:
         System.out.println("Eka Oso ");
         break;
   
	 case 3:
   	 System.out.println("Eka Ale");
         break;
      
	   }

      break;  
      
      case 3:
      System.out.println(" 1. morning, \n 2. Afternoon or\n 3. night ");
      int igboTime = input.nextInt();
      
      switch(igboTime){
         
         case 1:
         System.out.println("nde ewo");
         break;

	 case 2:
         System.out.println("Ehihe oma");
         break;
   
	 case 3:
  	 System.out.println("kachi fo");
         break;
      
         
           }   
      break; 

    }


}
}