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
   
   double[] averages = new double[studentNumber];
   int checker[] = new int[studentNumber];

   int[] position = new int[studentNumber];
   
   int[] total = new int[studentNumber];

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
   double average = 0;
   int summation = 0;
   for(int number = 0; number < studentNumber; number++){
      for (int students = 0; students < subjectNumber; students++){
         summation += subject[number][students];
         average = summation / subjectNumber;
		}
   total[number] = summation; 
   averages[number] = average;
   summation = 0; 
	}
    for(int number = 0; number < studentNumber; number++){
       checker[number] = total[number];}

  
      int largest = 0;
   for(int numberOfTimes = 0; numberOfTimes < studentNumber; numberOfTimes++){
      for(int number = 0; number < studentNumber; number++){
         if (checker[number] > checker[largest]){ 
            largest = number; }    
            

	}	   
         position[largest] = (numberOfTimes + 1);

         checker[largest] = 0 - numberOfTimes;       
}
    

   System.out.println("================================================================================");
   System.out.print("STUDENT         ");

   for(int number = 0; number < subjectNumber; number++){
      System.out.printf("SUB %d   ", (number + 1));
		}
   
   System.out.println("TOT        AVE       POS");
   System.out.println("================================================================================");

   for(int number = 0; number < studentNumber; number++){
      for(int count = 0; count < 1; count++){ 
         System.out.print(studentNo[number]);}
   
      for(int grade = 0; grade < subjectNumber; grade++){
         System.out.print("       ");
         System.out.print(subject[number][grade]);
		}
      for(int count = 0; count < 1; count++){ 
         System.out.print("     ");
         System.out.print(total[number]);
         System.out.print("       ");
         System.out.print(averages[number]);   
         System.out.print("       ");
         System.out.print(position[number]);      
		}
      System.out.println();
    }

   System.out.println("================================================================================\n\n");
   System.out.println("================================================================================");

   System.out.println("SUBJECT SUMMARY");
   double averageOne = 0;
   int totalTwo = 0;
   int large = 0;
   int low = 0;
   int largestOne = 0;
   int leastOne = 0;
   int[] answers = new int[6]; 
   int check = 0;  

   for(int number = 0; number < subjectNumber; number++){
      System.out.printf("subject %d%n", (number + 1));
      int[] highest = new int[studentNumber];
      int[] lowest = new int[studentNumber];
      int totals = 0;

      for(int grade = 0; grade < studentNumber; grade++){
         highest[grade] = subject[grade][number];
         lowest[grade] = subject[grade][number];
        		} 
	
      for(check = 0; check < subjectNumber; check++){
         if (highest[check] > answers[0]){
            answers[0] = highest[check];
            large = answers[0];
	}
         if (highest[check] < answers[1]) {
            answers[1] = highest[check];
            low = answers[1];
                  }
         totalTwo += highest[check];
         averageOne = totalTwo / subjectNumber ;
         }
			
        
     System.out.printf("Highest scoring student is: Student %d scoring %d%n", (check + 1), large );
     System.out.printf("lowest scoring student is: Student %d scoring %d%n ", (check + 1), low );
     System.out.printf("total is: %d%n", totalTwo);
     System.out.printf("average is: %g%n", averageOne);

		}

	}

}
   