public class pixelQuantitizer{
   public static void main(String[] args){
   int[] pixels = {10, 15, 25, 30, 40, 36, 45, 44, 46, 56, 78, 89, 118, 156, 155, 176, 177, 200, 188, 199};
   int pixelNumber;
      for (pixelNumber = 0; pixelNumber < pixels.length; pixelNumber++){
         if (pixels[pixelNumber] >= 0 &&  pixels[pixelNumber] <= 20){
            pixels[pixelNumber] = 10;     
             }
         else if (pixels[pixelNumber] >= 21 &&  pixels[pixelNumber] <= 40){
            pixels[pixelNumber] = 30;     
             }
         else if (pixels[pixelNumber] >= 41 &&  pixels[pixelNumber] <= 60){
            pixels[pixelNumber] = 50;     
             }
         else if (pixels[pixelNumber] >= 61 &&  pixels[pixelNumber] <= 80){
            pixels[pixelNumber] = 70;     
             }
         else if (pixels[pixelNumber] >= 81 &&  pixels[pixelNumber] <= 100){
            pixels[pixelNumber] = 90;     
             }
         else if (pixels[pixelNumber] >= 101 &&  pixels[pixelNumber] <= 120){
            pixels[pixelNumber] = 110;     
             }
         else if (pixels[pixelNumber] >= 121 &&  pixels[pixelNumber] <= 140){
            pixels[pixelNumber] = 130;     
             }
         else if (pixels[pixelNumber] >= 141 &&  pixels[pixelNumber] <= 160){
            pixels[pixelNumber] = 150;     
             }
         else if (pixels[pixelNumber] >= 161 &&  pixels[pixelNumber] <= 180){
            pixels[pixelNumber] = 170;     
             }
         else if (pixels[pixelNumber] > 181 ){
            pixels[pixelNumber] = 190;     
             }
         
  } 
       System.out.println(pixels);
}

}