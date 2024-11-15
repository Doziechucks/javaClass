import java.security.SecureRandom;

public class DiceFrequency{
   public static void main(String[] args){
      int total = 0;
      SecureRandom random = new SecureRandom();
      int[] frequency = new int[6];

      for (int roll = 1; roll <= 60000000; roll++){
         ++frequency[1 + random.nextInt(6)];
      
      }
      System.out.printf("%s%10s%n", "face", "Frequency");

      for (int face = 1; face < (frequency.length); face++){
         System.out.printf("%4d%10d%n", face, frequency[face]);
         total  += frequency[face];
  }
     System.out.println(total);
}
}