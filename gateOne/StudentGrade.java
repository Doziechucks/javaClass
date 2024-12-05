import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("How many Students do you have in your class: ");
   int studentNumber = input.nextInt();
   while (studentNumber < 1 || studentNumber > 100){
      System.out.println("Invalid Student number");
      System.out.print("How many Students do you have in your class: ");
      studentNumber = input.nextInt();      
	}
   System.out.print("How many subjects did these students offer: ");
   int subjectNumber = input.nextInt();
   while (subjectNumber < 1 || subjectNumber > 100){
      System.out.println("Invalid subject Number");
      System.out.print("How many subjects did these students offer: ");
      subjectNumber = input.nextInt(); 
	}
   
   int[][] subject = new int[studentNumber][subjectNumber];   


   

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
         while (subjectOne < 1 || subjectOne > 100){
            System.out.println("Invalid Score");
            System.out.printf("Enter the score for student %d subject %d: ", (number + 1), (students + 1)); 
            subjectOne = input.nextInt();
	} 
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
   int largestOne = 0;
   int leastOne = 0;
   int[] answers = new int[2]; 
   int check = 0; 
   int gradeOne = 0;
   int passes = 0;
   int fails = 0; 
   int low = 100;
   int lowIndex = 0;
   int highIndex = 0;
   int[] failed = new int[subjectNumber];
   int[] highestOne = new int[subjectNumber];
   int[] lowestTwo = new int[subjectNumber];
   int failedSubject = 0;
   int largestThree = 0;
   int passedSubject = 0;
   int largestTwo = 0;
   int numberSummary = 0;
   int largestFour = 0;
   int leastFour = 100;

   for(numberSummary = 0; numberSummary < subjectNumber; numberSummary++){
      System.out.printf("subject %d%n", (numberSummary + 1));
      int[] highest = new int[studentNumber];
      int[] lowest = new int[studentNumber];
      int totals = 0;
      
      for(gradeOne = 0; gradeOne < studentNumber; gradeOne++){
         highest[gradeOne] = subject[gradeOne][numberSummary];
         lowest[gradeOne] = subject[gradeOne][numberSummary];
        		} 
	
      for(check = 0; check < studentNumber; check++){
         if (highest[check] > large){
            large = highest[check];
            highIndex = check;
	}
         
         if (highest[check] < low) {
            low = highest[check];
            lowIndex = check;
                              }

         totalTwo += highest[check];
         averageOne = totalTwo / studentNumber;
         }
      for(int gradeTwo = 0; gradeTwo < studentNumber; gradeTwo++){	
         if(highest[gradeTwo] >= 50) passes += 1;
         else fails += 1;
	}	
      



      System.out.printf("Highest scoring student is: Student %d scoring %d%n", (highIndex + 1), large);
      System.out.printf("lowest scoring student is: Student %d scoring %d%n", (lowIndex+ 1), low);
      System.out.printf("total is: %d%n", totalTwo);
      System.out.printf("average is: %g%n", averageOne);
      System.out.printf("number of passes: %d%n", passes);
      System.out.printf("Number of fails is: %d%n%n%n%n", fails);
      failed[numberSummary] = fails;
      highestOne[numberSummary] = large;
      lowestTwo[numberSummary] = low;
      large = 0;
      low = 100;
      totalTwo = 0;
      passes = 0;
      fails = 0;
		}
      largestTwo = failed[0];
      largestThree = failed[0];
      for(int number = 0; number < subjectNumber; number++){
         if (failed[number] > largestThree){
            largestThree = failed[number];
            failedSubject = number;
         }
         if (failed[number] < largestTwo){
            largestTwo = failed[number];
            passedSubject = number;
		}
	}
      largestFour = 0;
      leastFour = 100;
      int indexFour = 0;
      int indexThree = 0;
      for(int number = 0; number < subjectNumber; number++){
         if(highestOne[number] > largestFour) {
            largestFour = highestOne[number];
            indexThree = number;
		}
         if(lowestTwo[number] < leastFour){
            leastFour = lowestTwo[number];
            indexFour = number;
		}                       

	}
      int studentPosition = 0;
      int studentPositionLow = 0;
      int totalFive = 0;
      int highThree = 0;
      int studentBest = 0;
      int worstStudent = 0;
      int badThree = 100 * subjectNumber;
      int [] bestGuy = new int[studentNumber];
      for(int number = 0; number < studentNumber; number++){
         int[] best = new int[subjectNumber];
         for(int grade = 0; grade < subjectNumber; grade++ ){
            if (largestFour == subject[number][grade]) studentPosition = number;
            if (leastFour== subject[number][grade]) studentPositionLow = number;
            best[grade] = subject[number][grade];
	 	}
         for(int count = 0; count < subjectNumber; count++ ){
            totalFive += best[count];}
         bestGuy[number] = totalFive;
         totalFive = 0;
	}
      for(int number = 0; number < studentNumber; number++){
         if (bestGuy[number] > highThree) {
            highThree = bestGuy[number];
            studentBest = number;
		}
         if (bestGuy[number] < badThree){
             badThree = bestGuy[number];
             worstStudent = number;
		}
}
      int overallTotal = 0;
      for(int number = 0; number < studentNumber; number++){
         for(int students = 0; students < subjectNumber; students++){  
             overallTotal += subject[number][students];
	}
}    
      double overallAverage = overallTotal / studentNumber;

      System.out.printf("the hardest subject is subject %d with failures %d%n", (failedSubject + 1), largestThree);
      System.out.printf("the easiest subject is subject %d with failures %d%n", (passedSubject + 1), largestTwo);
      System.out.printf("overall highest score was scored by student %d in subject %d scoring %d",(studentPosition + 1), (indexThree + 1), largestFour);
      System.out.printf("overall lowest score was scored by student %d in subject %d scoring %d%n",(studentPositionLow + 1), (indexFour + 1), leastFour ); 
      System.out.println("================================================================================\n");
      System.out.println("CLASS SUMMARY");
      System.out.println("================================================================================\n");
      System.out.printf("Best Graduating Student is: Student %d scoring %d%n",(studentBest + 1), highThree);
      System.out.println("================================================================================\n\n");
      System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
      System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", (worstStudent + 1), badThree);
      System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
      System.out.println("================================================================================\n");
      System.out.printf("Class total is score is: %d%n", overallTotal);
      System.out.printf("Class average is score is: %g%n", overallAverage);
      System.out.println("================================================================================\n");
      
       
	}

}
   