import java.util.ArrayList;
public class ArrayIntersect{
   public static void main(String[] args){
     
      int[] firstArray = {1, 2, 3, 4};
      int[] secondArray = {3, 4, 5, 6};
      ArrayList<Integer> items = new ArrayList<Integer>();
     
      for(int number = 0; number < firstArray.length; number++){
         for(int check = 0; check < secondArray.length; check++){
            if(firstArray[number] == secondArray[check] && (items.contains(firstArray[number])) == false){
            items.add(firstArray[number]);
}       
      } 
}
      System.out.println(items);
   }
}