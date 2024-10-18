import java.util.Scanner;

public class AddDigits{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter a three digit number: ");
   int  digitA = input.nextInt();
   int firstNo = digitA / 100;
   int lastNo = digitA % 10;
   int tosec = digitA / 10;
   int secondNo = tosec % 10;
   int sumOfDig = firstNo + secondNo + lastNo;
   System.out.printf("the sum of the digits in the number is %d: \n", sumOfDig);
};
}