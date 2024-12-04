import java.util.Scanner;
public class PanGram{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Input String to check:");
      String userInput = input.nextLine();
     
      System.out.println(returnIfPanGram(userInput));

}
   public static boolean returnIfPanGram(String userInput){
      if (userInput.length() < 26){
         return false;	
	}

      else{
         for (char alphabet = 'a'; alphabet <= 'z'; alphabet++){
               if(userInput.contains(""+ alphabet) == false){
                  return false;        
	}
                
		}

	}
          return true;	
}

}