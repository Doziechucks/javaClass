import java.util.Scanner;

public class LoopChecker{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int quitter;

   System.out.print("Enter number: ");
   int userInput = input.nextInt();
   int largest = userInput; 
   do {
      System.out.print("Enter number: ");
      int userInput2 = input.nextInt();
      if (userInput2 > largest) largest = userInput2;

      System.out.print("Enter -1 to quit else press any other number: ");
      quitter = input.nextInt();}

   while(quitter != -1);
System.out.printf("the largest number is: %d%n", largest);
}
}