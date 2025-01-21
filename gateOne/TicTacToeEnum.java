import java.util.Scanner;

public class TicTacToe{

   Public enum XandO { X, O

	}

   static String [][] values = new String[3][3];  

   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   

   for(int number = 0; number < 3; number++){
      for(int index = 0; index < 3; index++){
         values[number][index] = " ";
		}
	}
      int number = 0;
      int game = 0;

      while(number < 9 && game == 0){
      box();
      System.out.print("Enter the row: ");
      int rowInput = input.nextInt();
      while(rowInput > 3){
         System.out.print("Invalid input Enter the row: ");
         rowInput = input.nextInt();
	}
      System.out.print("Enter the column: ");
      int columnInput = input.nextInt();
      while(rowInput > 3 || rowInput < 1 ){
         System.out.print("Invalid input Enter the row: ");
         columnInput = input.nextInt();
	}
      if(number % 2 == 0){
         if(values[rowInput - 1][columnInput - 1].equals("X") || values[rowInput - 1][columnInput - 1].equals("O")){
            System.out.print("position already chosen enter a new one: ");
            number = number - 1;
			}
         else values[rowInput - 1][columnInput - 1] = "X";
         
         }
   		
      else {
         if(values[rowInput - 1][columnInput - 1].equals("X") || values[rowInput - 1][columnInput - 1].equals("O")){
            System.out.print("position already chosen enter a new one: ");
            number = number - 1;
			}
         else values[rowInput - 1][columnInput - 1] = "O";
            }
      if(values[0][0].equals(values[0][1]) && values[0][0].equals(values[0][2]) && !(values[0][0].equals(" "))) game = 1;
      else if(values[1][0].equals(values[1][1]) && values[1][0].equals(values[1][2]) && !(values[1][0].equals(" "))) game = 1;
      else if(values[2][0].equals(values[2][1]) && values[2][0].equals(values[2][2]) && !(values[2][0].equals(" "))) game = 1;
      else if(values[0][0].equals(values[1][0]) && values[0][0].equals(values[2][0]) && !(values[0][0].equals(" "))) game = 1;
      else if(values[1][0].equals(values[1][1]) && values[1][0].equals(values[1][2]) && !(values[1][0].equals(" "))) game = 1;
      else if(values[2][0].equals(values[2][1]) && values[2][0].equals(values[2][2]) && !(values[2][0].equals(" "))) game = 1;
      else if(values[0][0].equals(values[1][1]) && values[0][0].equals(values[2][2]) && !(values[0][0].equals(" "))) game = 1;
      else if(values[2][0].equals(values[1][1]) && values[1][2].equals(values[0][2]) && !(values[2][0].equals(" "))) game = 1;

      

      if(game == 1 && number % 2 == 0) System.out.print("Player One is the winner"); 
      else if(game == 1 && number % 2 == 1) System.out.print("Player Two is the winner");
      else if(game == 0 && number == 8) System.out.print("its a draw");
     
      number = number + 1;
       
      System.out.print(game);
	}
      box();
}
   public static void box(){
   System.out.printf("""
    \n
        col1 col2 col3
       -------------
   row1| %S | %S | %S |
       -------------
   row2| %S | %S | %S |
       -------------
   row3| %S | %S | %S |
       -------------
""", values[0][0], values[0][1], values[0][2], values[1][0], values[1][1], values[1][2], values[2][0], values[2][1], values[2][2]) ;
	}

}