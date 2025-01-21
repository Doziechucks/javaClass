import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Search{
   @Test
   public void testSearch(){

      Search search = new Search();

      int[] inputs = {12, 17, 24, 32, 14};
      int constant = 24;

      String actual = search.searcher(constant, inputs);
      String expected = "index: 2";

      assertEquals(expected, actual);
    
	}
}