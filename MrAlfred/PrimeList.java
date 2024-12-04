import java.util.Scanner;
import java.util.ArrayList;

public class PrimeList{
   public static void main{
   Scanner input new Scanner(System.in);
   
   System.out.print("Enter integer: ");
   int input = input.nextInt();
   System.out.println(ReturningPrimeList(input));
	}
public static Array<Integer> ReturningPrimeList(input){
   int count = o;
   Array<Integer> prime = new Array<Integer>();
   for(int number = 1; number < input.length; number++){
      int count = 0;
      for(int interger = 1; integer < input.length; integer++){
         if (number / integer == 0) count++;
     }
      if (count = 2){
       prime.add(number);
   
}
	}
   return prime;
}
}