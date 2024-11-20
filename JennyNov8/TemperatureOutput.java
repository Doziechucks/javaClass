import java.util.Scanner;

public class TemperatureOutput{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the environments temperature: ");
      int environsTemperature = input.nextInt();

      if(environsTemperature < 10) System.out.println("cold");
      else if(environsTemperature >= 10 && environsTemperature <= 25) System.out.println("warm");
      else if(environsTemperature > 25) System.out.println("Hot");


}
}