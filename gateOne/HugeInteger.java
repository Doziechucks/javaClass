import java.util.Scanner;
import java.text.ParseException;

public class HugeInteger{

	private int[] numbers;

	public HugeInteger(String numbers){
		parse(numbers);
}

   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter number: ");
   String stringInput = input.Next()

      
	} 

   public int[] parse(String input){
	this.numbers = new int[40];

      for(int number = 0, number < input.length(); number++){
         boolean done = false;
         while(!done){
            try{
               this.numbers[39 - number] = input.charAt(input.length() - 1 - number) - '0';
               done = true;
			}

            catch(ParseException except){
               System.out.print("Invalid Input")
      return integerInputs;
			}
		}
	} 

   @Override
   public String toString(){
	String output = "";
	boolean readyToAppend = false;
	for(int number: this.numbers){
		
		if(!readyToAppend && number != 0 ){
			readyToAppend = true;
		}
		output += (readyToAppend)? number: "";
	}

	return output;
	}
}






