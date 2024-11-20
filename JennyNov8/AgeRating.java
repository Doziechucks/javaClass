import java.util.Scanner;

public class AgeRating{
   public static void main(String[] Args){
      Scanner input = new Scanner(System.in);

      System.out.print("Enter your age: ");
      int userAge = input.nextInt();
      
      if (userAge >= 0 && userAge <= 12) System.out.println("Child");
      else if (userAge >= 17 && userAge <= 17) System.out.println("Teen");
      else if (userAge >= 18 && userAge <= 65) System.out.println("Adult");
      else if (userAge > 65) System.out.println("Senior");
      else {System.out.println("invalid input");}

}
      
}