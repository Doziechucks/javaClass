import java.util.Scanner;

public class UserReturnSwitch{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter grade, 50, 70 100: ");
      int userGrade = input.nextInt();
      
      switch(userGrade){
      
      case 50:
      System.out.println("C");
      break;
      
      case 70:
      System.out.println("B");
      break;

      
      case 100:
      System.out.println("A");
      break;

      


}
System.out.println("Well done");

}
}