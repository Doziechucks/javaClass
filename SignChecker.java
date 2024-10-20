import java.util.Scanner;

public class SignChecker{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int positiveSign = 0;
      int negativeSign = 0;
      int zeroCounter = 0;
      int inputCounter = 1;
      
      while(inputCounter <= 5){
      System.out.print("Enter a number: ");
      int enteredNumber = input.nextInt();
      
         if(enteredNumber < 0){
            negativeSign++;}
         else if(enteredNumber > 0){
            positiveSign++;}
         else{
            zeroCounter++;};
       inputCounter++;  
      

}
System.out.printf("you entered: %s negative numbers, %s positive numbers, and %s zeros \n", negativeSign, positiveSign, zeroCounter);
};
} 