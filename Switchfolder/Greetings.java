import java.util.Scanner;

public class Greetings{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("Enter \n 1. For greeting in English \n 2. For greeting in Yoruba \n 3. For greeting in Igbo");
      int userInput = input.nextInt();

      switch(userInput){
      
      case 1:
      System.out.println("Good morning!");
      break;
            

      case 2:
      System.out.println("Eku aro omo ge");
      break;

      case 3:
      System.out.println("Otutu Oma!");
      break;

}

}
}