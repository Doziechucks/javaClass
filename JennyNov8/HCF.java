import java.util.Scanner;

public class HCF{
   public static void main(String[] args){
      Scanner input =  new Scanner(System.in);
      
      System.out.print("enter first number: ");
      int firstNumber = input.nextInt();

      System.out.print("enter second number: ");
      int secondNumber = input.nextInt();
      int highestCommon = 1;

      for(int number = 1; number <= firstNumber; number++){
         if(firstNumber % number == 0 && secondNumber % number == 0){
            int newCommon =  number;
            if (newCommon  > highestCommon){
               highestCommon = newCommon;
            }
                 }
       } 


      System.out.printf("the HCF of %d and %d is %d%n", firstNumber, secondNumber, highestCommon);
     }

   }