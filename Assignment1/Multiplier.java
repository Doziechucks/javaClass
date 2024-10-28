import java.util.Scanner;
public class Multiplier{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("enter number: " );
   int numberInput = input.nextInt();

   for(int i = 0; i <= numberInput; i ++ ){
      int product = numberInput * i ; 
      System.out.printf(" %d x %d = %d%n",numberInput, i, product);
      
}
      
}} 