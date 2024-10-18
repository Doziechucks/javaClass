import java.util.Scanner;

public class feetConvert{
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value for feet: ");
      float valueF = input.nextFloat();
      Double ValueM = valueF * 0.305;
      System.out.printf("Your value in meter is: %g \n", ValueM);

};
}