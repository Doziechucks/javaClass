import java.util.Scanner;
public class Multiplier{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("enter number: " );
   int userInput = input.nextInt();
   
   if (userInput == 1) System.out.println("Monday");
   if (userInput == 2) System.out.println("Tuesday");
   if (userInput == 3) System.out.println("Wednesday");
   if (userInput == 4) System.out.println("Thursday");
   if (userInput == 5) System.out.println("Friday");
   if (userInput == 6) System.out.println("Saturday");
   if (userInput == 7) System.out.println("Sunday");
}} 