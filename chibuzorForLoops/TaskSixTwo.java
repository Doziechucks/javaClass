public class TaskSixTwo{
public static void main(String[] args){
int multiplier = 1;
int multiplierAnswer;
for (int number = 1; number<= 10; number++){

   if (number % 4 == 0){
      for (int counter = 1; counter <= 5; counter++){
    
         multiplierAnswer = multiplier * number;
         multiplier = multiplierAnswer;
         System.out.printf("%d ", multiplierAnswer);
         }
         
      System.out.print(" ");
     }
	multiplier = 1;
}
System.out.println();
}
}