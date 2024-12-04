import java.util.ArrayList;
public class ReverseList{
   public static void main(String[] args){
   int[] list = {2, 9, 3, 4};
   System.out.println(ReturnReverseList(list));

   }
   public static ArrayList<Integer> ReturnReverseList(int[] list){
      ArrayList<Integer> arrayReverse = new ArrayList<Integer>();
      for (int number = list.length - 1; number >= 0; number--){
         
            arrayReverse.add(list[number]);
          }
         
         
        
      return arrayReverse;
   } 
}