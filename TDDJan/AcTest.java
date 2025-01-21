import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class AcTest{

  
   @Test
   public void test_ifAcIsOn(){

      AirCondition airCondition = new AirCondition();

      airCondition.turnOn();
      assertTrue(airCondition.getIsOn()); 

	}

   @Test
   public void test_isAcTempBelowThirty(){

      AirCondition airCondition = new AirCondition();

      
} 


}



