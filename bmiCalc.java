import java.util.Scanner;

public class bmiCalc{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter weight in kilograms: ");
       Float weightinkilograms = input.nextFloat();
       System.out.print("Enter height in meters: ");
       Float heightinmeters = input.nextFloat();
       Float bmi = (weightinkilograms)/(heightinmeters * heightinmeters);
       System.out.printf("the Body mass index is: %f \n", bmi);
     



};
}