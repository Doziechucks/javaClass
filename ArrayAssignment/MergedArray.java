import java.util.Arrays;
public class MergedArray{
   public static void main(String[] args){
      int[] firstValues = {1, 3, 5};
      int[] secondValues = {4, 2, 9};
      int firstLength = firstValues.length;
      int secondLength = secondValues.length;
      int mergedLength = firstLength + secondLength;
      int[] merged = new int[mergedLength];
      int firstCount = 0; 
      int secondCount = 0; 
      int mergedCount = 0;
      

      while (firstCount < firstValues.length && secondCount < secondValues.length){
         if(firstValues[firstCount] < secondValues[secondCount]){
            merged[mergedCount] = firstValues[firstCount];
            firstCount++;
            mergedCount++;    

              }
         else {
           merged[mergedCount] = secondValues[secondCount];
            merged[mergedCount] = firstValues[firstCount];
            secondCount++;
            mergedCount++;
         }
}
      while (firstCount < firstValues.length){
         merged[mergedCount] = firstValues[firstCount];
            firstCount++;
            mergedCount++; 
}
      while (secondCount < secondValues.length){
         merged[mergedCount] = secondValues[secondCount];
            secondCount++;
            mergedCount++; 
}


      System.out.println(Arrays.toString(merged)); 
      
      


}
} 