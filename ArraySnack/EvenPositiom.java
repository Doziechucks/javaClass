public class OddPositiom{
   public static void main(String[] args){
   int[] list = {2, 9, 3, 4, 1, 5};
   System.out.println(ReturnOdd(list));

   }
   public static int ReturnOdd(int[] list){
      int number;
      for (number = 0; number < list.length; number++){
         if (number % 2 == 1) System.out.print(list[number]);
         }
      return 
   
}
}