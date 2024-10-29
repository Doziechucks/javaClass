import java.util.Random;
import java.util.Scanner;
public class RandomGuesser{
public static void main(String[] args){
   Random random = new Random();
   Scanner input = new Scanner(System.in);
   
   int randomNumber = random.nextInt(1000);
   
   System.out.print("Enter random number: ");
   int guess = input.nextInt();

   while (guess != randomNumber){
      if (guess > randomNumber) System.out.println("guess to high");
      else if (guess < randomNumber) System.out.println("guess to low");
      System.out.print("Enter random number: ");
      guess = input.nextInt();}
   System.out.println("guess is correct");
  

}
}