import java.util.Scanner;
public class TaxPayCheck{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter Wage: " );
   int numberInput = input.nextInt();
   double tax;
   if (numberInput <= 15000){
   tax = numberInput * 0.15 ;}
   else {
   tax = numberInput * 0.15 ;}
System.out.printf("your tax is: %f%n",tax);
}
}