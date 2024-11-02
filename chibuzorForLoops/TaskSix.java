public class TaskSix{
public static void main(String[] args){
for (int number = 1; number<= 10; number++){
   if (number % 4 == 0){
      int numberOne = number*number;
      int numberTwo = number*number*number;
      int numberThree = number*number*number*number;
      int numberFour = number*number*number*number*number;
      System.out.printf(" %d",number);
      System.out.printf(" %d",numberOne);
      System.out.printf(" %d",numberTwo);
      System.out.printf(" %d",numberThree);
      System.out.printf(" %d",numberFour);
      System.out.print(" ");
}


}
System.out.println();
}
}