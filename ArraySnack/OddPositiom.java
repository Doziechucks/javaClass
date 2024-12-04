public class EvenPositiom{
   public static void main(String[] args){
   int[] list = {2, 9, 3, 4, 1, 5};
   System.out.println(ReturnEven(list));

   }
   public static int ReturnEven(int[] list){
      for (number = 0; number < list.length; number++){
         if (number % 2 == 0) 
         System.out.print(list[number]);
         }
      
   }
}