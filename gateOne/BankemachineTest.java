import java.util.ArrayList;
import java.util.Scanner;

public class BankeMachineTest{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   BankeMachine machine = new BankeMachine();

   System.out.println("Please enter first name: ");
   String firstName = input.nextLine();

   System.out.println("Please enter second name: ");
   String secondName = input.nextLine();   

   String fullName = "" + firstName + " " + secondName + "";
   machine.setName(fullName);

   ArrayList<String> names

   System.out.printf("name is: %s%n", machine.getName());
	}
   
      
	

}