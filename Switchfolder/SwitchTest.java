import java.util.Scanner;

public class SwitchTest{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter \n 1. To get a greeting \n 2. To get a Stop");
      int decision = input.nextInt();

      switch(decision){

      case 1:
      System.out.println("hello, you are welcome");
      break;

      case 2:
      System.out.println("have a nice day");
      break;
    
   }

}
}
  
