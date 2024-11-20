import java.util.Scanner;

public class SumEvenInt{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter lower number: ");
   int lowerInput = input.nextInt();
   int sum = 0;
   System.out.print("Enter higher number: ");
   int higherInput = input.nextInt();

   if (lowerInput <= higherInput){
     
       
      for(int number = (lowerInput + 1); number < higherInput; number +=1){
         if (number % 2 == 0){
            sum = sum + number; 
                             }
                                }
      System.out.println(sum);
   
                                }

   else System.out.println("Invalid Input");        

          }

}

   