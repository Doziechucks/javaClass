import java.util.Scanner;

public class AdderLoop{

   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   String stopChecker;
      do {
         System.out.print("enter first number: "); 
         int firstNo = input.nextInt();
         System.out.print("enter second number: "); 
         int secondNo = input.nextInt();
         int sumNumber = firstNo + secondNo;
         System.out.printf("the sum of the numbers is: %d%n", sumNumber);
         System.out.print("press ! If you'll like to exit: ");
         stopChecker = input.nextLine();
        
         
     }  while (stopChecker != "!");  

        
     
         

}
}