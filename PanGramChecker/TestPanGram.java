import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestPanGram{
   @Test
   public void testPangram(){
      PanGram panGram = new PanGram();
      String text = "you know I am not tired yet so keep giving me";
      boolean actual = panGram.returnIfPanGram(text);
      boolean expected = false;
      
      assertEquals(actual, expected);
 }
   

}
