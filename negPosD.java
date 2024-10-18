import java.util.Scanner;

public class negPosD{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter first number: ");
      int firstNo = input.nextInt();
      
      int posNum = 0;
      int negNum = 0;
      int zeroNum = 0;
      if(firstNo > 0) {
         posNum = posNum + 1;
      };
      if(firstNo == 0) {
         zeroNum = zeroNum + 1;
      };
      if(firstNo < 0) {
         negNum = negNum + 1;
      };
      
      System.out.print("Enter second number: ");
         int secondNo = input.nextInt();
 
      if(secondNo > 0) {
         posNum = posNum + 1;
      }
      if(secondNo == 0) {
         zeroNum = zeroNum + 1;
      }
      if(secondNo < 0) {
         negNum = negNum + 1;
      }
      System.out.print("Enter third number: ");
        int thirdNo = input.nextInt();
 
      if(thirdNo > 0) {
         posNum = posNum + 1;
      };
      if(thirdNo == 0) {
         zeroNum = zeroNum + 1;
      }
      if(thirdNo < 0) {
         negNum = negNum + 1;
      }

      System.out.print("Enter fourth number: ");
      int fourthNo = input.nextInt();
 
      if(fourthNo > 0) {
         posNum = posNum + 1;
      }
      if (fourthNo == 0) {
         zeroNum = zeroNum + 1;
      }
      if (fourthNo < 0) {
         negNum = negNum + 1;
      }

            System.out.print("Enter fifth number: ");
      int fifthNo = input.nextInt();
 
      if(fifthNo > 0) {
         posNum = posNum + 1;
      }
      if (fifthNo == 0) {
         zeroNum = zeroNum + 1;
      }
      if (fifthNo < 0) {
         negNum = negNum + 1;
      }

      System.out.printf("the number with positive, negative and zero numbers are %d, %d, and %d in number respectively \n", posNum, negNum, zeroNum);
}
}