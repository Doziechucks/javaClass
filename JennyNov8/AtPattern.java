public class AtPattern{
public static void main(String[] args){

   for(int number =  0; number <= 6; number += 1){
      for(int times = 6; times >=  number; times -= 1){
      System.out.print(" ");
                 }
      for(int ats = 1; ats <= number; ats += 1 ){
      System.out.print("@");             
                         }
      System.out.println();
}
}
}