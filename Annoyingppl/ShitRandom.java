import java.util.Scanner;
import java.util.Random;

public class ShitRandom{

   public static void main(String[] args){
   Random random = new Random();
   Scanner input = new Scanner(System.in);
   int newGenerated;
   int count = 0;
   int generated = random.nextInt(9);
   if (generated / 2 == 0 && generated < 7){
      newGenerated = generated * 105031;}
   else if (generated / 2 == 1 && generated < 5){
      newGenerated = generated * 120431 ;}
   else newGenerated = generated * 89343;
      int firstDigit = newGenerated / 100000;
      int lastDigit = newGenerated % 10;
      int tosec = newGenerated / 10000;
      int secondDigit = tosec % 10
      int tothird = newGenerated / 1000;
      int thirdDigit = tothird % 10;
      int toforth = newGenerated % 100
      int fourtDigit = toforth / 10
      
   while (count < 6){
      System.out.print("Enter lottery 6 digit: ") ;
      int lottery = input.nextInt();
      if (lottery == newGenerated){
         System.out.println("correct");
         break; }
      else
         System.out.print("you are not correct Try again"); 
      int firstDigitI = newGenerated / 100000;
      int lastDigitI = newGenerated % 10;
      int tosecI = newGenerated / 10000;
      int secondDigitI = tosecI % 10
      int tothirdI = newGenerated / 1000;
      int thirdDigitI = tothirdI % 10;
      int toforthI = newGenerated % 100
      int fourtDigitI = toforthI / 10
      if(firstDigitI == firstDigit) System.out.print("first digit is correct");
      if(lastDigitI == lastDigit) System.out.print("first digit is correct");
      if(firstDigitI == firstDigit) System.out.print("first digit is correct");
      if(firstDigitI == firstDigit) System.out.print("first digit is correct");
      if(firstDigitI == firstDigit) System.out.print("first digit is correct");
         count++;
}
      System.out.println("number of attempt reached");
     
}

}