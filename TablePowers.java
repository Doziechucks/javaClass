public class TablePowers{
   public static void main(String[] args){

   
System.out.print("a\t\tb\t\tpow(a, b)");   
   for(int numbers = 1; numbers <= 5; numbers++){
          System.out.printf(numbers, (numbers + 1), Math.pow(numbers, (numbers + 1)));
}
}
}