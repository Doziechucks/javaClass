import java.util.Scanner;
public class SignChecker{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int numberInput = input.nextInt();

      if (numberInput < 0 ){
      System.out.println("the number is a negative number "); }
       
      if (numberInput > 0 ){
      System.out.println("the number is a positive number "); }

      if (numberInput == 0 ){
      System.out.println("the number is a neutral number "); }
}
}