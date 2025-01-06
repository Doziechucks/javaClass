import java.util.Scanner;

public class TicTacToe{
   static String [][] values = new String[3][3];  

   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   

   for(int number = 0; number < 3; number++){
      for(int index = 0; index < 3; index++){
         values[number][index] = " ";
		}
	}
   for(int number = 0; number < 9; number++){
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
	}   

   
}
   public static void box(){
   System.out.printf("""
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