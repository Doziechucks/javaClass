import java.util.Scanner;

public class InvestmentValue{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.print("Enter invested amount: ");
      float investmentAmount = input.nextFloat();

      System.out.print("Enter interest rate: ");
      float interestRate = input.nextFloat();

      System.out.print("Enter number of years: ");
      float numberOfYears = input.nextFloat();
      
      float monthlyInterestRate = interestRate/12;
    
      double returnOnInvestment = investmentAmount * (Math.pow((1 + monthlyInterestRate/100), numberOfYears*12));
     
     System.out.printf("the return on investment is: %g%n", returnOnInvestment);
}
}