import java.util.Scanner;
import java.util.Arrays;

public class PrimeArray{
   public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter number: ");
   
   int answer = input.nextInt();  
   System.out.println(Arrays.toString(PrimeReturn(answer)));
 
		}



public static int PrimeCount(int answer){
   int count = 0;
   int counter = 0;
   for(int number = 1; number < answer; number++){
      for(int integer = 1; integer <= number; integer++){
         if (number % integer == 0) count++;
	}    
      if (count == 2) counter++;
      count = 0; 
	}
   return counter;
}


public static int[] PrimeReturn(int number){

   int count = PrimeCount(number);
   
   int[] list = new int[count];
   
   int counter = 0;
   for(int numberI = 1; numberI < number; numberI++){
      for(int integer = 1; integer <= numberI; integer++){
         if (numberI % integer == 0) count++; }
         if (count == 2) {
            list[counter] = numberI; 
            counter++;}
            count = 0; 
       	 }    
      return list;
	}   
   

}
