import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MenstrualApp{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Date currentDate = new Date();
      String[] dateStrings = new String[3];
      int[] dateFigures = new int[3];
      int checker = 1;
      do{
         System.out.print("Enter the last time your flow start date(DD/MM/YY): ");
         String dateInput = input.next();
         dateStrings = dateInput.split("/");
      
         for(int number = 0; number < 3; number++){
            dateFigures[number] = Integer.parseInt(dateStrings[number]);
		}
      
         if(dateFigures[0] < 1 || dateFigures[0] > 31) System.out.println("Invalid Input ");
         else if(dateFigures[1] < 1 || dateFigures[1] > 12) System.out.println("Invalid Input");
         else if(dateFigures[1] == 2 && dateFigures[2] / 4 != 0 && dateFigures[0] > 28) System.out.println("Invalid Input");
         else if(dateFigures[1] == 9 && dateFigures[0] > 30) System.out.println("Invalid Input");
         else if(dateFigures[1] == 4 && dateFigures[0] > 30) System.out.println("Invalid Input");
         else if(dateFigures[1] == 6 && dateFigures[0] > 30) System.out.println("Invalid Input");
         else if(dateFigures[1] == 11 && dateFigures[0] > 30) System.out.println("Invalid Input");
         else if(dateFigures[1] == 2 && dateFigures[2] / 4 == 0 && dateFigures[0] > 29) System.out.println("Invalid Input");
         else if(dateFigures[2] < 1 || dateFigures[2] > 99) System.out.println("Invalid Input");      
         else checker = 2;
		}
         while(checker == 1) ;

		
	
      System.out.println(Arrays.toString(dateStrings));
      

      

	}

}