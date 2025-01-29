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
        int expected = 1;
        int actual = bike.getSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifBikeOnCanAccelerateAgain(){
        bike.turnOn();
        bike.setSpeed(15);
        bike.accelerate();
        int expected = 16;
        int actual = bike.getSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifBikeSpeedIncreasesByTwoInGearTwo(){
        bike.turnOn();
        bike.setSpeed(21);
        bike.accelerate();
        int expected = 23;
        int actual = bike.getSpeed();
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifBikeCanAccelerateOff(){
        bike.setSpeed(21);
        bike.accelerate();
        int expected = 21;
        int actual = bike.getSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifBikeDecelerate(){
        bike.setSpeed(48);
        bike.decelerate();
        int expected = 44;
        int actual = bike.getSpeed();
        assertEquals(expected, actual);
    }

}
