import java.util.Scanner;
public class PatternPrint{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter highest pattern number: ");
      int userGrade = input.nextInt();

      for (int number = 1; number <= userGrade; number++){
         for(int amount = 1; amount <= number; amount++){
            System.out.print(amount);
             }
         System.out.println();    
}
      for(int number = userGrade; number > 0; number--){ 
         for(int num = 1; num < (number+1) ; num++){
            System.out.print(num);
             }
      System.out.println();

}
}
}