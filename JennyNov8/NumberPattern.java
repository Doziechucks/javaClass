import java.util.Scanner;

public class NumberPattern{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter number: ");
      int userInput = input.nextInt();
     
      for (int column = 1; column <= userInput; column++){
         for (int spaces = userInput; spaces > column; spaces--){
            System.out.print(" ");
                      }
         for (int number = column; number >= 1; number--){
            System.out.print(number); 
            }
         
         for (int number = 2; number <= column ; number++){
            System.out.print(number); }
            System.out.println();

}
      for (int column = userInput; column > 1; column--){
         for (int spaces = column; spaces <= userInput; spaces++){
            System.out.print(" ");
                      }
         for (int number = column - 1; number >= 1; number--){
            System.out.print(number); 
            }
         
         for (int number = 2; number <= column-1 ; number++){
            System.out.print(number); }
            System.out.println();

}
}
} 