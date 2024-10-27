import java.util.Scanner;

public class RightMostsame{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter first Number: ");
   int firstNumber = input.nextInt();
   
   System.out.print("Enter second Number: ");
   int secondNumber = input.nextInt();

   System.out.print("Enter third Number: ");
   int thirdNumber = input.nextInt();
   
   int edgeOne = firstNumber % 10;
   int edgeTwo = secondNumber % 10;
   int edgeThree = thirdNumber % 10;
   
   if(edgeOne ==  edgeTwo || edgeOne ==  edgeThree || edgeTwo ==  edgeThree){
      System.out.println("True");}
   else {
      System.out.println("False");}
}

}
}