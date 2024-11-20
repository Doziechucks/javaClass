import java.util.Scanner;

public class Medals{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter rank: ");
      int userRank = input.nextInt();

      switch(userRank){

      case 1:
      System.out.println("Gold Medal");
      break;

      case 2:
      System.out.println("Silver Medal");
      break;

      case 3:
      System.out.println("Bronze Medal");
      break;
 
      case 4:
      System.out.println("Participant Ribbon");
      break;     

    }
}
}