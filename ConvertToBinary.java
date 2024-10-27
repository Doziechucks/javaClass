import java.util.Scanner;
public class ConvertToBinary{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("enter Decimal number: ");
   int decimal = input.nextInt();
   while(decimal != 0){
      int binary = decimal % 2;
       System.out.printf("%d \r", binary);
      decimal = decimal / 2;
     
}
System.out.print("\n");
}
}