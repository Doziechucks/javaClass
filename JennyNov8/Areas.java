import java.util.Scanner;
import java.util.Random;

public class Areas{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random  random = new Random();
      Double pie = 3.142;
      System.out.print("Enter shape you'll like to calculate the area(Circle, Rectangle, Triangle): ");
      String shape = input.nextLine();
      String chosenShape = shape.toUpperCase();
      switch(chosenShape){
    
         case "CIRCLE":
         System.out.println("do you want to 1. \"input\" your values or do you want 2. \"random\" generated values");
         String ce = input.nextLine();
            String circle = ce.toUpperCase();
            switch(circle){
               
               case "RANDOM":
               int randomRadius = random.nextInt();
               double randomArea = pie * randomRadius * randomRadius;
               System.out.printf("your randomly generated area is: %f%n", randomArea);
               break; 

               case "INPUT":
               System.out.print("Enter your radius: ");
               int radiusC = input.nextInt();
               double area = pie * radiusC * radiusC;
               System.out.printf("area of your circle is: %f%n", area);
        
               break; 

                                   }
         break;
         case "RECTANGLE":
         System.out.println("do you want to 1. \"input\" your values or do you want 2. \"random\" generated values ");
         String re = input.nextLine();
            String rectangle = re.toUpperCase();
            switch(rectangle){

               case "RANDOM":
               int randomLength = random.nextInt(100);
               int randomBreath = random.nextInt(100);
               int randomAreaR = randomLength * randomBreath;
               System.out.printf("your randomly generated area is: %d%n", randomAreaR);
               break; 

               case "INPUT":
               System.out.println("Enter the length of the rectangle: ");
               int lengthR = input.nextInt();
               System.out.println("Enter the breath of the rectangle: "); 
               int breathR = input.nextInt();

               int areaOfRectangle = lengthR * breathR;
               System.out.printf("the area of the rectangle is: %d%n", areaOfRectangle);
               
               break; 
                                   }
          break;

         case "TRIANGLE":
         System.out.println("do you want to 1. \"input\" your values or do you want 2. \"random\" generated values: ");
         String tri = input.nextLine();
            String triangle = tri.toUpperCase();
            switch(triangle){
               
               case "RANDOM":
               int randomBase = random.nextInt(100);
               int randomHeight = random.nextInt(100);
               double randomAreaT = (0.5) * randomHeight * randomBase;
               System.out.printf("the random area of the triangle is: %f%n", randomAreaT);
               break; 

               case "INPUT":
               System.out.println("Enter base of triangle: ");
               int baseT = input.nextInt();
              
               System.out.println("Enter height of the triangle: "); 
               int heightT = input.nextInt();
 
               Double areaOfTriangle = (0.5) * baseT * heightT;
               System.out.printf("the triangle area is: %f%n", areaOfTriangle);
               break; 
                                   }
          break;
    
    
    }
}
}