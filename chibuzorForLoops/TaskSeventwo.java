public class TaskSeventwo{
public static void main(String[] args){
int multiplier = 1;
int multiplierAnswer = 1;
int sumOfNumbers = 0;
for (int number = 1; number<= 10; number++){

   if (number % 4 == 0){
      for (int counter = 1; counter <= 5; counter++){
    
         multiplierAnswer = multiplier * number;
         multiplier = multiplierAnswer;
         sumOfNumbers += multiplierAnswer;
         
         }
      System.out.printf("%d", sumOfNumbers);
      System.out.print(" "); 
     }
   multiplier = 1; 
   sumOfNumbers = 0;

}
System.out.println();
}
}