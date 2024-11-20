import java.util.ArrayList;

public class DublicateFinder{
   public static void main(String[] args){
      int man = 0;
      int[] intValues = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5};
      ArrayList<Integer> items = new ArrayList<Integer>();
      for(int values = 0; values < intValues.length; values++){
         for(int duplicate = values + 1; duplicate < intValues.length; duplicate++){
            if (intValues[values] == intValues[duplicate] && (items.contains(intValues[values])) == false){
               items.add(intValues[values]);}
                          }
                   }
      for(int check = 0; check < items.size(); check++){
         System.out.print(items.get(check)); 
}
           
              
      System.out.println(); 
      


}
} 