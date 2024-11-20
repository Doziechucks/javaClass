public class LowestValue{
   public static void main(String[] args){
      int[] intValues = {4, 2, 9, 1, 5};
      int lowest = intValues[0];
      for(int values = 1; values < intValues.length; values++){
         if (intValues[values] < lowest){
            lowest = intValues[values];
} 
         
           }
      System.out.println(lowest);
      
      


}
} 