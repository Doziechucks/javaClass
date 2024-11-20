import java.util.ArrayList;
import java.util.Arrays;
public class ArrayReverse{
   public static void main(String[] args){
      ArrayList<Integer> items = new ArrayList<Integer>();
      int values;
      int numbers;
      int[] intValues = {1, 2, 3, 4, 5};
      
      for(values = (intValues.length - 1); values >= 0; values--){
         items.add(intValues[values]);
      
      }
      
         System.out.println(items); 
      


}
} 