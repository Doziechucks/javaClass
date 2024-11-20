import java.util.Scanner;

public class NumberAddRange{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
         int sum = 0;
         System.out.print("Enter lower number range: ");
         int lowerNumber = input.nextInt();

         System.out.print("Enter higher limit number: ");
         int higherNumber = input.nextInt();

         if (lowerNumber <= higherNumber){
            for(int number = lowerNumber; number <= higherNumber; number += 1){

               if (number % 13 == 0 && number %  7 == 0)  {
               sum = sum + number;
                  System.out.println(sum);
               break;
                   }
                
                   }

            if (sum == 0) System.out.println("there is no number that has 7 and 13 as factors within the given range");
                                       }
        

         else System.out.println("Invalid input");


         

}
}











