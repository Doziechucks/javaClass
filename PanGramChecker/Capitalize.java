import java.util.Scanner;
public class Capitalize{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.print("Enter Sentence to check: ");
      String userInput = input.nextLine();
      System.out.print(firstCapital(userInput));

	}
      public static String firstCapital(String userInput){
         for(int index = 0; index < userInput.length; index++){
            if( index == 0 || userInput.charAt(index - 1) == ' '){
               userInput.charAt(index).toUpperCase();
			}
		}
          return userInput;
	}

}