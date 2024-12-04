public class PracticeThree{

   public static void main(String... args){
      PrintTriangle(4);  
 
}
   public static void PrintTriangle(int input){
      UpperPrint(input);
      LowerPrint(input);

      }
   public static void PrintStar(){
      System.out.print("* ");}

   public static void PrintNextLine(){
      System.out.println();}

   

   public static void PrintStarVar(int input){
      for(int count = 0; count < input; count++){
         PrintStar();
      }    }
 
   public static void UpperPrint(int number){
      for(int print = 1; print <= number; print++){
         PrintStarVar(print);
         PrintNextLine();
}
}

   public static void LowerPrint(int number){
      for(int print = number; print > 0; print--){
         PrintStarVar(print);
         PrintNextLine();
}
}


      
}