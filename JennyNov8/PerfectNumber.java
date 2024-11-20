import java.util.Scanner;

public class PerfectNumber{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter number: ");
      int userInput = input.nextInt();
      int number = 1;
      int sum = 0;
      while(number < userInput){
         if (userInput % number == 0){
            sum = sum + number;
            
            }
            number++;                   }
      if (userInput == sum) System.out.printf("%d is a perfect number %n", userInput);
      else System.out.printf("%d is not a perfect number %n", userInput);
}
}