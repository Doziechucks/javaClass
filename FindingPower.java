import java.util.Scanner;
public class FindingPower{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("enter base number: ");
   int baseNumber = input.nextInt();
   System.out.print("enter power number: ");
   int powerNumber = input.nextInt();
   int multiple = 1;
   int newTimes = 1;
   while(multiple <= powerNumber ){
      newTimes *= baseNumber;
      multiple ++; 
}
System.out.printf("your answer is: %d%n", newTimes );

}
}