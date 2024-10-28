import java.util.Scanner;
import java.text.DecimalFormat;
public class ConsonantVowelChecker{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter first number: " );
   float firstNumber = input.nextFloat();
   
   System.out.print("Enter second number: " );
   float secondNumber = input.nextFloat();
   
   DecimalFormat df = new DecimalFormat("#.###");
   String firstNo = df.format(firstNumber);
   String secondNo = df.format(secondNumber);
  
   if (firstNo.equals(secondNo)){
      System.out.print("they are equal\n");}
   else {
      System.out.print("they are not equal\n");}
   


}
}