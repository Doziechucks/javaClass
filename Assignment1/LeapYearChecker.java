import java.util.Scanner;
public class Multiplier{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("enter number: " );
   int yearInput = input.nextInt();
   if (yearInput % 4 == 0 ){
      System.out.printf("%d%n is  a leap year", yearInput);}
   else {
      System.out.printf("%d is not a leap year %n", yearInput);}
}
}