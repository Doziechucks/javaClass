import java.util.Scanner;

public class Mbti{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int countOneA = 0;
      int countOneB = 0;
      int countTwoA = 0;
      int countTwoB = 0;
      int countThreeA = 0;
      int countThreeB = 0;
      int countFourA = 0;
      int countFourB = 0;
      
      String choiceOne = "";
      String choiceTwo = "";
      String choiceThree = "";
      String choiceFour = "";
      
      String [] answerArray = new String[20];
      String [] extroIntroArray = new String[4];

      String[][] questions = {{"Question 1\nExpend energy, enjoy groups. ", "B. Conserve energy, enjoy one-on-one: "},
{"Question 2\nA. Interpret literally. ", "B. Look for meaning and possibilities: "},
{"Question 3\nA.logical, thinking, questioning. ", "B. empathetic, feeling, accommodating: "},
{"Question 4\nA. Organized, orderly. ", "B. flexible, adaptable: "},
{"Question 5\nA. More outgoing, think out loud. ", "B. more reserved, think to yourself: "},
{"Question 6\nA. Practical, realistic, experiential. ", "B. imaginative, innovative, theoretical: "},
{"Question 7\nA. Candid, straight forward, frank. ", "B. tactful, kind, encouraging: "},
{"Question 8\nA. Plan, schedule. ", "B. Unplanned, spontaneous: "},
{"Question 9\nA. Seek many tasks, public activities, interaction with others. ", "B.seek private, solitary activities with quiet to concentrate: "},
{"Question 10\nA. Standard, usual, conventional. ", "B. different, novel, unique: "}, 
{"Question 11\nA. Firm, tend to criticize, hold the line. ", "B. gentle, tend to appreciate, conciliate: "},
{"Question 12\nA. Regulated, structured. ", "B. Easygoing, \"live\" and \"let live\": "},
{"Question 13\nA. external Communicative. , express yourself", "B. Internal, reticent, keep to yourself: "},
{"Question 14\nA. Focus on here-and-now. ", "B. look to the future, global perspective \"big picture\": "},
{"Question 15\nA. Tough-minded, just. ", "B. tender-hearted, merciful: "},
{"Question 16\nA. Preparation, plan ahead. ", "B. go with the flow, adapt as you go: "},
{"Question 17\nA. Active, initiate. ", "B. reflective, deliberate: "},
{"Question 18\nA. facts, things, \"what is\". ", "B. Ideas, dreams, \"what could be,\" philosophical: "},
{"Question 19\nA. matter of fact, issue-oriented. ", "B. Sensitive, people-oriented, compassionate: "},
{"Question 20\nA. control, govern. ", "B. latitude, freedom: "}
};

System.out.print("Enter your name: ");
String name = input.nextLine(); 
         
         for (int displays = 0; displays < questions.length; displays++){
            System.out.print(questions[displays][0]);
            System.out.print(questions[displays][1]);
            String answers = input.nextLine(); 
            
            if (answers.equalsIgnoreCase("a") || answers.equalsIgnoreCase("b")){
               if (answers.equalsIgnoreCase("a")){
                  answerArray[displays] = questions[displays][0]; }
               else {
                  answerArray[displays] = questions[displays][1];
                  
                   }
                      }
   
             
            else {System.out.println("invalid input please input either A or B");
                 displays--;}
            if (displays % 4 == 0) { 
               if (answers.equalsIgnoreCase("a")){
                  countOneA++;}
               else countOneB++;
                    }
            else if (displays % 4 == 1) {
               if (answers.equalsIgnoreCase("a")){
                  countTwoA++;}
               else countTwoB++;
 }
            else if (displays % 4 == 2) {
               if (answers.equalsIgnoreCase("a")){
               countThreeA++;}
               else countThreeB++;
}
            else if (displays % 4 == 3) {
               if (answers.equalsIgnoreCase("a")){
                  countFourA++;}
               else countFourB++;
}

                        }
            
         if (countOneA < countOneB) choiceOne = "I"; 
         else choiceOne = "E";
            
         if (countTwoA < countTwoB) choiceTwo = "S"; 
         else choiceTwo = "N";

         if (countThreeA < countThreeB)choiceThree = "T"; 
         else choiceThree = "F"; 
         
         if (countFourA < countFourB) choiceFour = "J"; 
         else choiceFour = "P"; 
 
         extroIntroArray[0] = choiceOne;
         extroIntroArray[1] = choiceTwo;
         extroIntroArray[2] = choiceThree;
         extroIntroArray[3] = choiceFour;
        
         String personality = "";
         for(int count = 0; count < extroIntroArray.length; count++){
            personality += extroIntroArray[count];
         }
            
       
        
         switch(personality){
    
            case "ISTJ":
               System.out.println("ISTJ - The Duty Fulfiller \n personality type is defined by its logical decision-making processes and exceptional organizational skills. They often value a strict order and organization within their workplaces, and they find comfort in tradition and repetition. Because of this, workplace scenarios that change often typically aren't suited for ISTJ types. When it comes to work that requires organized focus and singular correct answers, ISTJs tend to shine. Here are some of the best careers for this personality:"); 
               break;
           
               case "ISTP":
               System.out.println("ISTP - The Mechanic \n Quiet and reserved, interested in how and why things work. Excellent skills with mechanical things. Risk-takers who live in the current moment. Usually interested in and talented at extreme sports. Uncomplicated in their desires. Loyal to their peers and to their internal value systems, but not overly concerned with respecting laws and rules if they get in the way of getting something done. Detached and analytical, they excel at finding solutions to practical problems."); 
               break;

               case "ISFJ":
               System.out.println("ISFJ - The Nurturer \n Quiet, kind, and conscientious. Can be depended on to follow through. Usually puts the needs of others above their own needs. Stable and practical, they value security and traditions. Well-developed sense of space and function. Rich inner world of observations about people. Extremely perceptive of other's feelings. Interested in serving others");       
               break;

               case "ISFP":
               System.out.println("ISFP - The Artist \n Quiet, serious, sensitive and kind. Do not like conflict, and not likely to do things to generate conflict. Loyal and faithful. Extremely well-developed senses, and aesthetic appreciation for beauty. Not interested in leading or controlling others. Flexible and open-minded. Likely to be original and creative. Enjoy the present moment.");
               break;

               case "INFJ":
               System.out.println("INFJ - The Protector \n Quietly forceful, original, and sensitive. Tend to stick to things until they are done. Extremely intuitive about people, and concerned for their feelings. Well-developed value systems which they strictly adhere to. Well-respected for their perseverance in doing the right thing. Likely to be individualistic, rather than leading or following.");

               case "INFP":
               System.out.println("INFP - The Idealist \n Quiet, reflective, and idealistic. Interested in serving humanity. Well-developed value system, which they strive to live in accordance with. Extremely loyal. Adaptable and laid-back unless a strongly-held value is threatened. Usually talented writers. Mentally quick, and able to see possibilities. Interested in understanding and helping people.");
	       break;

	       case "INTJ":
	       System.out.println("INTJ - The Scientist \n Independent, original, analytical, and determined. Have an exceptional ability to turn theories into solid plans of action. Highly value knowledge, competence, and structure. Driven to derive meaning from their visions. Long-range thinkers. Have very high standards for their performance, and the performance of others. Natural leaders, but will follow if they trust existing leaders.");
	       break;

	       case "INTP":
               System.out.println("INTP - The Thinker \n Logical, original, creative thinkers. Can become very excited about theories and ideas. Exceptionally capable and driven to turn theories into clear understandings. Highly value knowledge, competence and logic. Quiet and reserved, hard to get to know well. Individualistic, having no interest in leading or following others.");
	       break;

               case "ESTP":
               System.out.println("ESTP - The Doer \n Friendly, adaptable, action-oriented. \"Doers\" who are focused on immediate results. Living in the here-and-now, they're risk-takers who live fast-paced lifestyles. Impatient with long explanations. Extremely loyal to their peers, but not usually respectful of laws and rules if they get in the way of getting things done. Great people skills.");
	       break;

               case "ESTJ":
	       System.out.println("ESTJ - The Guardian \n Practical, traditional, and organized. Likely to be athletic. Not interested in theory or abstraction unless they see the practical application. Have clear visions of the way things should be. Loyal and hard-working. Like to be in charge. Exceptionally capable in organizing and running activities. \"Good citizens\" who value security and peaceful living.");
	       break;

               case "ESFP":
               System.out.println("ENFP - The Inspirer \n Enthusiastic, idealistic, and creative. Able to do almost anything that interests them. Great people skills. Need to live life in accordance with their inner values. Excited by new ideas, but bored with details. Open-minded and flexible, with a broad range of interests and abilities.");
	       break;

	       case "ENFJ":
 	       System.out.println("ENFJ - The Giver \n Popular and sensitive, with outstanding people skills. Externally focused, with real concern for how others think and feel. Usually dislike being alone. They see everything from the human angle, and dislike impersonal analysis. Very effective at managing people issues, and leading group discussions. Interested in serving others, and probably place the needs of others over their own needs.");
               break;

               case "ENTP":
 	       System.out.println("ENTP - The Visionary \n Creative, resourceful, and intellectually quick. Good at a broad range of things. Enjoy debating issues, and may be into \"one-up-manship\". They get very excited about new ideas and projects, but may neglect the more routine aspects of life. Generally outspoken and assertive. They enjoy people and are stimulating company. Excellent ability to understand concepts and apply logic to find solutions.");
	       break;

	       case "ENTJ":
 	       System.out.println("ENTJ - The Executive \n Assertive and outspoken - they are driven to lead. Excellent ability to understand difficult organizational problems and create solid solutions. Intelligent and well-informed, they usually excel at public speaking. They value knowledge and competence, and usually have little patience with inefficiency or disorganization.");
	       break;
 
               case "ENFP":
	       System.out.println("ENFP - The Inspirer \n Enthusiastic, idealistic, and creative. Able to do almost anything that interests them. Great people skills. Need to live life in accordance with their inner values. Excited by new ideas, but bored with details. Open-minded and flexible, with a broad range of interests and abilities.");
               break;

	       case "ESFJ":
               System.out.print("ESFJ - The Caregiver \n Warm-hearted, popular, and conscientious. Tend to put the needs of others over their own needs. Feel strong sense of responsibility and duty. Value traditions and security. Interested in serving others. Need positive reinforcement to feel good about themselves. Well-developed sense of space and function.");
	       break;

               }
}

}

