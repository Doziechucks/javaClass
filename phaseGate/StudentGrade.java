import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("How many Students do you have in your class: ");
   int studentNumber = input.nextInt();

   System.out.print("How many subjects did these students offer: ");
   int subjectNumber = input.nextInt();
   
   int[][] subject = new int[studentNumber][subjectNumber];   
   System.out.println(Arrays.deepToString(subject));

   String[] studentNo = new String[studentNumber];
   
   Float[] averages = new Float[studentNumber]

   for(int number = 0; number < studentNumber; number++){
      studentNo[number] = "student " + (number + 1) + "" ;
		}
   
   
   for(int number = 0; number < studentNumber; number++){
      for(int students = 0; students < subjectNumber; students++){
         System.out.printf("Enter the score for student %d subject %d: ", (number + 1), (students + 1));
         int subjectOne = input.nextInt();
         subject[number][students] = subjectOne;
      
		}
   for(int number = 0; number < studentNumber; number++){
      scoreAverage Arrays.average
}
   
}
   System.out.println("================================================================================");
   System.out.print("STUDENT         ");

   for(int number = 0; number < subjectNumber; number++){
      System.out.printf("SUB %d   ", (number + 1));
		}
   
   System.out.println("AVE    POS");
   System.out.println("================================================================================");

   for(int number = 0; number < studentNumber; number++){
      for(int count = 0; count < 1; count++){ 
         System.out.print(studentNo[number]);}
   
      for(int grade = 0; grade < subjectNumber; grade++){
         System.out.print("       ");
         System.out.print(subject[number][grade]);
		}
      System.out.println();
    }
   System.out.println(Arrays.deepToString(subject));
	}
}