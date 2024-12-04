public class LargestElement{
   public static void main(String[] args){
   int[] list = {2, 9, 3, 4};
   System.out.println(ReturnLargest(list));

   }
   public static int ReturnLargest(int[] list){
      int largest = list[0];
      for (int number = 1; number < list.length; number++){
         if (list[number] > largest) largest = list[number];}
         return largest;
         
      
   }
}