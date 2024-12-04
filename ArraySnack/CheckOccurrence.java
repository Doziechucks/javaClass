public class CheckOccurrence{
   public static void main(String[] args){
   String [] list = {"man", "woman", "girl", "boy"};
   String check = "boy";
   System.out.println(ReturnIfInList(list, check));

   }
   public static Boolean ReturnIfInList(String[] list, String check){
      for (int number = 1; number < list.length; number++){
         if (list[number].equalsIgnoreCase(check)) return true;
         else return false; }
         
      
   }
   
}
