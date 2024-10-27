import java.util.Scanner;
public class BMI{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the weight: ");
      float weigthInput = input.nextFloat();
      
      System.out.print("Enter the height: ");
      float heightInput = input.nextFloat();

      double weight = weigthInput * 0.45359237;
      double height = heightInput * 0.0254;
   
      double BMI = weight / (height * height);
   
   System.out.printf("the body mass index is : %f%n", BMI);
}
}