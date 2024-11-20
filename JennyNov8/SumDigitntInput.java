import java.util.Scanner;

public class SumDigitntInput{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int userInput = input.nextInt();
      int sum = 0;
      while (userInput > 0){
         int digit = userInput % 10;
         sum = sum + digit;
         userInput = userInput / 10;

                         }
         

System.out.printf("the sum of the digits is: %d%n", sum);
}

}