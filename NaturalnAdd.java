public class NaturalnAdd{
   public static void main(String[] args){
      int addCount = 1;
      int numberSum = 0;
      while(addCount <= 10){
      numberSum = numberSum + addCount;
      addCount++;
      }
      
   System.out.printf("the sum of natural number to 10 is: %s\n", numberSum);
}

}