public class Search{
   public static void main(String[] args){
      int[] inputs = {12, 17, 24, 32, 14};
      int constant = 24;
      
      Search search = new Search();
      System.out.print(search.searcher(constant, inputs));

 }
   public String searcher(int constant, int[] inputs){
   
      for(int number = 0; number < inputs.length; number++){
         if(inputs[number] == constant) return "index: " + number + "";
		}
      return "Not available";
     
	}

}