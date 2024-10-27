import java.util.Scanner;
public class SimpleSumC{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter integer number: ");
   int integerNum = input.nextInt();
   System.out.print("Enter float number: ");
   float floatNum = input.nextFloat();
   System.out.print("Enter double number: ");
   double doubleNum = input.nextDouble();
   double sumOfnum = doubleNum + floatNum + integerNum;
   System.out.printf("the sum is %g%n:", sumOfnum);
   
}
}  
