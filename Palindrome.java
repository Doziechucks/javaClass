import java.util.Scanner;

public class Palindrome{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter a three digit number: ");
   int ifPalin = input.nextInt();
   int firstNo = ifPalin / 100;
   int lastDig = ifPalin % 10;

   if (firstNo == lastDig){
      System.out.println("the inputed number is a palindrome"); 
       }
 
   else{
        System.out.println("the inputed number is not a palindrome");
       }
      
};
   
}