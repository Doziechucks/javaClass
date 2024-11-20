import java.util.Scanner;
public class NonsenseIf{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int payment = 2500;
      double discount = 1;
      System.out.print("Enter the Vehicle type: ");
      String vehicle = input.nextLine();

      System.out.print("Enter the the years for the car: ");
      int noYears = input.nextInt();

      System.out.print("Enter the the number of consecutive return years: ");
      int noRetun = input.nextInt();
      
      if(vehicle.equalsIgnoreCase("Car") && noYears < 5){
         if (noRetun >= 2){
            discount = payment * 0.07; }
         else
            discount = payment * 0.05; 
         
           }

      if(vehicle.equalsIgnoreCase("truck") && noYears > 10){
         discount = payment * 0.1;
         if (noRetun >= 2){
            discount = payment * 0.07;}
         else
            discount = payment * 0.05; 
         
           }
      System.out.print(discount);
}

}