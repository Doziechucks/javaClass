public class TaskSix{
public static void main(String[] args){
for (int number = 1; number<= 10; number++){
   if (number % 4 == 0){
      int numberOne = number*number;
      int numberTwo = number*number*number;
      int numberThree = number*number*number*number;
      int numberFour = number*number*number*number*number;
      int summationOne = number + numberOne + numberTwo + numberThree + numberFour;
      System.out.print(summationOne);
      System.out.print(" ");
}


}
System.out.println();
}
}