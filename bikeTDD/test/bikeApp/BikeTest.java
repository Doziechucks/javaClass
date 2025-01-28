package bikeApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike bike;

    @BeforeEach
    void setUp() {
        bike = new Bike();
    }
    @Test
    public void test_ifBikeOff(){
        assertFalse(bike.getIsOn());
    }

    @Test
    public void test_ifBikeCanbeTurnedOn(){
        bike.turnOn();
        assertTrue(bike.getIsOn());
    }
    @Test
    public void test_ifBikeCanBeTurnedOff(){
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.getIsOn());

    }

    @Test
    public void test_ifBikeOnCanAccelerate(){
        bike.turnOn();
        bike.accelerate();
        String expected = 1;
        String actual = bike.getSpeed();
        assertEquals(expected, actual);
    }
}
