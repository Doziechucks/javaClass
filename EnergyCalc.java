import java.util.Scanner;
   public class EnergyCalc{
      public static void main(String[] args){
         Scanner input = new Scanner(System.in);

         System.out.print("Enter initial temperature: ");
         Float initialTemperature = input.nextFloat();

         System.out.print("Enter final temperature: ");
         Float finalTemperature = input.nextFloat();

         System.out.print("Enter amount of water in kg: ");
         Float massOfWater = input.nextFloat();

         Float energyNeeded = massOfWater * (finalTemperature - initialTemperature);
         System.out.printf("Energy needed is : %f%n", energyNeeded );

    
}

}