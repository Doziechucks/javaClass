import java.util.Scanner;

public class TaxPercent{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the Annual income: ");
      int userIncome = input.nextInt();
   
      if (userIncome >= 0 && userIncome <= 9875)  System.out.println("your tax percent is 10%");
      else if (userIncome >= 9876 && userIncome <= 40125)  System.out.println("your tax percent is 12%");
      else if (userIncome >= 40126 && userIncome <= 85525)  System.out.println("your tax percent is 22%");
      else if (userIncome > 85525)  System.out.println("your tax percent is 24%");


}
}