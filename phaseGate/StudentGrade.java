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
   

   for(int number = 0; number < studentNumber; number++){
      studentNo[number] = "student " + (number + 1) + "" ;
		}
   
   
   for(int number = 0; number < studentNumber; number++){
      for(int students = 0; students < subjectNumber; students++){
         System.out.printf("Enter the score for student %d subject %d: ", (number + 1), (students + 1));
         int subjectOne = input.nextInt();
         subject[number][students] = subjectOne;
      
		}

}
   System.out.println(Arrays.deepToString(subject));
	}
}