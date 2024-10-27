import java.util.Scanner;

public class LargestNumber{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
     
      System.out.print("Input the first number: ");
      int firstNumber = input.nextInt();
      int largest = firstNumber;    
  
      System.out.print("Input the second number: ");
      int secondNumber = input.nextInt();
      if (secondNumber > largest) largest = secondNumber;     

      System.out.print("Input the third number: ");
      int thirdNumber = input.nextInt();
      if (thirdNumber > largest) largest = thirdNumber; 
     
      System.out.printf("the largest number is: %d%n", largest);
      

   
}
}