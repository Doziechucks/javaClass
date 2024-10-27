import java.util.Scanner;
public class RunwayLength{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    
   System.out.print("Enter the speed and Acceleration of plane: ");
   float planeVelocity = input.nextFloat();
   float planeAcceleration = input.nextFloat();

   Float runwayLength = (planeVelocity * planeVelocity) / (2 * planeAcceleration);
   System.out.printf("the minimum runway length is: %f%n", runwayLength);
   
}
}