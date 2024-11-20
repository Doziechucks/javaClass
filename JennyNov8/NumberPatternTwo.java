import java.util.Scanner;

public class NumberPatternTwo{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter number: ");
      int userInput = input.nextInt();
     
      for (int column = 1; column <= userInput; column++){
         for (int number = 1; number <= column; number++ ){
          System.out.print(number);
          }
          System.out.println();
          }
      for (int column = userInput; column >=0; column--){
         for (int number = 1; number <= column - 1; number++ ){
           System.out.print(number);
                  }
           System.out.println();

}
   }
}