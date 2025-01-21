import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void isAcNotOn(){
        Main main = new Main();
        assertFalse(main.getAcStatus());
        }
    @Test
    public void isAcOn() {
        Main main = new Main();
        main.turnOnAc();
        assertTrue(main.getAcStatus());
    }

    @Test
    public void isAcTurnedOff(){
        Main main = new Main();
        main.turnOnAc();
        main.turnOffAc();
        assertFalse(main.getAcStatus());
        }

    @Test
    public void isTempbelowThirty(){
        Main main = new Main();
        main.turnOnAc();
        main.setTemperature(16);
        assertTrue(main.returnACTemp() < 30);

    }
    @Test
    public void isTemperatureIncreased(){
        Main main = new Main();
        main.turnOnAc();
        main.setTemperature(16);
        int actual = main.increaseTemp();
        int expected = 17;
        assertEquals(actual, expected);


    }

    @Test
    public void isTempIncreasedOff(){
        Main main = new Main();
        main.setTemperature(16);
        int actual = main.increaseTemp();
        int expected = 16;
        assertEquals(actual, expected);
    }

    @Test
    public void test_settermethod(){
        Main main = new Main();
        main.setTemperature(20);
        assertTrue(main.getAcTemperature() == 20);
    }

    @Test
    public void isTempIncreasedAboveThirty(){
        Main main = new Main();
        main.setTemperature(30);
        main.turnOnAc();
        int actual = main.increaseTemp();
        int expected = 30;
        assertEquals(actual, expected);

    }
    @Test
    public void isTemperaturereduced(){
        Main main = new Main();
        main.turnOnAc();
        main.setTemperature(20);
        int actual = main.reduceTemperature();
        int expected = 19;
        assertEquals(expected, actual);


    }
}


