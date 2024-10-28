import java.util.Scanner;
public class RootsOfQuadratics{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a: " );
   Float a = input.nextFloat();
   System.out.print("Enter b: " );
   float b = input.nextFloat();
   System.out.print("Enter c: " );
   int c = input.nextInt();
   float z = b*b - 4 * a * c;
   float w = (-b) / (2 * a);
   float x = z * -1 ;
   double q = Math.sqrt(x);
   if (z >= 0){
      double rootOne = (-b + (Math.sqrt(z))) / (2 * a);

      double rootTwo = (-b - (Math.sqrt(z))) / (2 * a);
   
      System.out.printf("the roots are %f and %f%n", rootOne, rootTwo);}
   else {
       System.out.printf("%f + %fi %n", w, q);
       System.out.printf("%f - %fi %n", w, q);
}


}
}