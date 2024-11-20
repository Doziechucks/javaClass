public class HighestValue{
   public static void main(String[] args){
      int[] intValues = {1, 2, 3, 4, 5};
      int highest = intValues[0];
      for(int values = 1; values < intValues.length; values++){
         if (intValues[values] > highest){
            highest = intValues[values];
} 
         
           }
      System.out.println(highest);
      
      


}
} 