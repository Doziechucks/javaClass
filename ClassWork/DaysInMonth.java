import java.util.Scanner;
public class DaysInMonth{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("enter month: ");
   String month = input.nextLine();
   
   System.out.print("enter month: ");
   int year = input.nextInt();
   System.out.printf(month);
   if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("December")){
      System.out.printf("print number days in year %d%n is: 31days", year);
   }
   else if(month.equalsIgnoreCase("September")|| month.equalsIgnoreCase("April") ||month.equalsIgnoreCase("June") || month.equalsIgnoreCase("November")){
      System.out.printf("print number days in year %d%n is: 30days", year);
   }
   else if(month.equalsIgnoreCase("February") && year / 4 == 0){
      System.out.printf("print number days in year %d%n is: 29days", year);}
   else if(month.equalsIgnoreCase("February")  && year / 4 != 0){
      System.out.printf("print number days in year %d%n is: 28days", year);}
   else{
      System.out.println("invalid");}
      


}
}
