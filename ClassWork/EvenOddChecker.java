import java.util.Scanner;
public class EvenOddChecker{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int numberInput = input.nextInt();

      if (numberInput % 2 == 0){
         System.out.println("1");
}        
      else {
         System.out.println("0"); }   
}   
}