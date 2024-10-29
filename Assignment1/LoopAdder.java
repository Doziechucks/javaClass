import java.util.Scanner;

public class LoopAdder{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int quitter;

   System.out.print("Enter number: ");
   int userInput = input.nextInt();
   int summation = userInput; 
   do {
      System.out.print("Enter number: ");
      int userInput2 = input.nextInt();
      summation = summation + userInput2;
      System.out.printf("sum is: %d%n", summation);
      
      System.out.print("Enter -1 to quit else press any other number: ");
      quitter = input.nextInt();}

   while(quitter != -1);
System.out.printf("the sum of the numbers are: %d%n", summation);
}
}