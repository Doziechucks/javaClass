import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;

public class MenstrualApp{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Date currentDate = new Date();
      Calendar calendar = Calendar.getInstance();
      SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

      String[] dateStrings = new String[3];
      int[] dateFigures = new int[3];
      int checker = 1;

      String dateInput = "";
      do{

      boolean done = false;
      while(!done){
         try{
            System.out.print("Enter the last time your flow start date(MM/DD/YYYY): ");
            dateInput = input.next();

            calendar.setTime(dateFormat.parse(dateInput));
         done = true;
            
	}

         catch(ParseException excep){
            excep.printStackTrace();
            System.out.println("Invalid Date format");
	}
}

         dateStrings = dateInput.split("/");
      
         for(int number = 0; number < 3; number++){
            dateFigures[number] = Integer.parseInt(dateStrings[number]);
		}
      
         if(dateFigures[1] < 1 || dateFigures[1] > 31) System.out.println("Invalid Input ");
         else if(dateFigures[0] < 1 || dateFigures[0] > 12) System.out.println("Invalid Input");
         else if(dateFigures[0] == 2 && dateFigures[2] / 4 != 0 && dateFigures[0] > 28) System.out.println("Invalid Input");
         else if(dateFigures[0] == 9 && dateFigures[1] > 30) System.out.println("Invalid Input");
         else if(dateFigures[0] == 4 && dateFigures[1] > 30) System.out.println("Invalid Input");
         else if(dateFigures[0] == 6 && dateFigures[1] > 30) System.out.println("Invalid Input");
         else if(dateFigures[0] == 11 && dateFigures[1] > 30) System.out.println("Invalid Input");
         else if(dateFigures[0] == 2 && dateFigures[2] / 4 == 0 && dateFigures[1] > 29) System.out.println("Invalid Input");
         else if(dateFigures[2] < 1900 || dateFigures[2] > 2050) System.out.println("Invalid Input");      
         else checker = 2;
		}
         while(checker == 1) ;
                
         long dayDiff = 1;

         try {
         Date inputedDate = dateFormat.parse(dateInput);
         Date current = new Date();
       

         long diffMillies = Math.abs(current.getTime() - inputedDate.getTime());

         dayDiff =  diffMillies / (1000 * 60 * 60 * 24);
        
         
          
            }        

         catch(ParseException excep){
            excep.printStackTrace();
            System.out.println("Invalid Date format");
	}

         
         LocalDate newDay = LocalDate.now().plusDays(28 - dayDiff);  
         LocalDate ovulation = LocalDate.now().plusDays(14 - dayDiff);
         LocalDate safe = LocalDate.now().plusDays(20 - dayDiff);
            

	 System.out.println("Your next flow day is on " + newDay + "");	
         System.out.println("Your ovulation day is  " + ovulation + "");
         System.out.println("Your safe periods are between  " + safe + " to " + newDay + "");	

     
      

      

	}

}