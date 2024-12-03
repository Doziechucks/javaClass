import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("How many Students do you have in your class: ");
   int studentNumber = input.nextInt();

   System.out.print("How many subjects did these students offer: ");
   int subjectNumber = input.nextInt();
   
   for(int number = 0; number < subjectNumber; number++){
      int[] subject = new int[studentNumber]; 
} 

   String[] studentNo = new String[studentNumber];
   

   for(int number = 0; number < studentNumber; number++){
      studentNo[number] = "student " + (number + 1) + "" ;
		}
   
   

	}
}