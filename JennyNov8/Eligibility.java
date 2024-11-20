import java.util.Scanner;

public class Eligibility{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your age: ");
      int userAge = input.nextInt();
      
      if(userAge >= 16 && userAge < 18) System.out.println("you are eligible to driving alone");
      else if(userAge >= 18 && userAge < 21) System.out.println("You are eligible to drive and vote");
      else if(userAge > 21) System.out.println("you are eligible to drive, vote and drink");
      else System.out.println("your are not eligible for anything adults do");

}
}