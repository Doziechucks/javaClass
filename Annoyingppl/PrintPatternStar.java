public class PrintPatternStar{
   public static void main(String[] args){
      for(int column = 0; column < 5; column++){
         for(int row = 0; row <= column; row++){
            System.out.print("*");
}
         for(int row = 4; row > column; row--){
            System.out.print(" ");}
     
         for(int colu = 4; colu > column; colu--){
            System.out.print(" ");
        }
         for(int row = column + 2; row > 1; row--){
            System.out.print("*"); 
 }

           System.out.println();  }

      for(int column = 0; column < 4; column++){
         for(int row = 4; row > column; row--){
            System.out.print("*");}
         for(int row = 0; row < column + 1; row++){
            System.out.print(" ");}
         for(int row = 0; row < column + 1; row++){
            System.out.print(" ");}
         for(int row = 4; row > column; row--){
            System.out.print("*");}
      System.out.println();   
}

}
}
