import java.util.Scanner;

public class UserReturn{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter grade: ");
      int userGrade = input.nextInt();
    
      if (userGrade < 50 ) System.out.println("D");
      if (userGrade >= 50 && userGrade <= 60)System.out.println("C");
      if (userGrade > 60 && userGrade <= 80)System.out.println("B");
      if (userGrade > 80 && userGrade <= 100)System.out.println("A");

 
}
}