import java.util.Scanner;

public class UserReturnSentinrl{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int userGrade = 0;
      while (userGrade != -1){
         System.out.print("Enter grade(or enter -1 to quit): ");
         userGrade = input.nextInt();
      
         if (userGrade >= 0 && userGrade < 50 ) System.out.println("D");
         if (userGrade >= 50 && userGrade <= 60)System.out.println("C");
         if (userGrade > 60 && userGrade <= 80)System.out.println("B");
         if (userGrade > 80 && userGrade <= 100)System.out.println("A");

 
}
}
}