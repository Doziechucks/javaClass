import java.util.Scanner;
public class ConsonantVowelChecker{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("enter a single alphabet: " );
   String alphabetInput = input.nextLine();
   
   if (alphabetInput.equalsIgnoreCase("a") || alphabetInput.equalsIgnoreCase("e") || alphabetInput.equalsIgnoreCase("I") || alphabetInput.equalsIgnoreCase("o") || alphabetInput.equalsIgnoreCase("u")){
      System.out.printf("%s is a vowel. %n", alphabetInput);}
   else if(alphabetInput.equalsIgnoreCase("b") || alphabetInput.equalsIgnoreCase("c") || alphabetInput.equalsIgnoreCase("d") || alphabetInput.equalsIgnoreCase("f") || alphabetInput.equalsIgnoreCase("g") || alphabetInput.equalsIgnoreCase("h") || alphabetInput.equalsIgnoreCase("j") || alphabetInput.equalsIgnoreCase("k") || alphabetInput.equalsIgnoreCase("l") || alphabetInput.equalsIgnoreCase("m") || alphabetInput.equalsIgnoreCase("n") || alphabetInput.equalsIgnoreCase("p") || alphabetInput.equalsIgnoreCase("q") || alphabetInput.equalsIgnoreCase("r") || alphabetInput.equalsIgnoreCase("s") || alphabetInput.equalsIgnoreCase("t") || alphabetInput.equalsIgnoreCase("v") || alphabetInput.equalsIgnoreCase("w") || alphabetInput.equalsIgnoreCase("x") || alphabetInput.equalsIgnoreCase("y") || alphabetInput.equalsIgnoreCase("z")){
      System.out.printf("%s is a consonant. %n", alphabetInput);}
   else {
      System.out.printf("invalid input Enter a single alphabet %n");
}
     

}
}