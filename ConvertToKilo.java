import java.util.Scanner;

public class ConvertToKilo {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("enter weight in pounds: ");
   float weightPounds = input.nextFloat();
   double weightInkilograms = weightPounds * 0.454;

   System.out.printf("enter weight in kilograms is: %f%n", weightInkilograms);
   
}
}