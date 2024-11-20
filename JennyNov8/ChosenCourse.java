import java.util.Scanner;

public class ChosenCourse{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter course(Math, Science and History): ");
      String cS = input.nextLine();
      String course = cS.toUpperCase();
      switch(course){
    
         case "Math":
         System.out.println("Enter Grade level: ");
         String gl = input.nextLine();
            String gradeLevel = gl.toUpperCase();
            switch(gradeLevel){
               
               case "FRESHMAN":
               System.out.println("Freshman");
               break; 

               case "SOPHOMORE":
               System.out.println("Sophomore");
               break; 

               case "JUNIOR":
               System.out.println("Junior"); 
               break; 

               case "SENIOR":
               System.out.println("Senior"); 
               break; 
                                   }
         break;
         case "SCIENCE":
         System.out.println("Enter Grade level: ");
         String sc= input.nextLine();
            String science = sc.toUpperCase();
            switch(science){
               case "FRESHMAN":
               System.out.println("Freshman");
               break; 

               case "SOPHOMORE":
               System.out.println("Sophomore");
               break; 

               case "JUNIOR":
               System.out.println("Junior"); 
               break; 

               case "SENIOR":
               System.out.println("Senior"); 
               break; 
                                   }
          break;

         case "HISTORY":
         System.out.println("Enter Grade level: ");
         String hi= input.nextLine();
            String history = hi.toUpperCase();
            switch(history){
               
               case "FRESHMAN":
               System.out.println("Freshman");
               break; 

               case "SOPHOMORE":
               System.out.println("Sophomore");
               break; 

               case "JUNIOR":
               System.out.println("Junior"); 
               break; 

               case "SENIOR":
               System.out.println("Senior"); 
               break; 
                                   }
          break;
    
    
    }
}
}