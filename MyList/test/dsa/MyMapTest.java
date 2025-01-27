package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMapTest {
    MyMap myMap;

    @BeforeEach
    void setUp() {
        myMap = new MyMap();
    }
    @Test
    public void test_ifMyMapIsEmpty() {
        int actual = myMap.isEmpty();
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void test_ifMymapAdds(){
        myMap.add("Dozie", "money");
        int actual = myMap.size();
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifKeyIsPrinted(){
        myMap.add("Dozie", "money");
        myMap.add("Divine", "boss");
        String actual = myMap.keys();
        String expected =  "{\"Dozie\", \"Divine\"}";
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifValueIsPrinted() {
        myMap.add("Dozie", "money");
        myMap.add("Divine", "boss");
        String actual = myMap.values();
        String expected = "[\"money\", \"boss\"]";
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifMapPrintsCorrectly(){
        myMap.add("Dozie", "money");
        String actual = myMap.mapPrint();
        String expected = "{\"Dozie\": \"money\"}";
        assertEquals(expected, actual);


    }

    @Test
    public void test_ifMapCanChangeValueWithKey(){
        myMap.add("Dozie", "money");
        myMap.add("Divine", "boss");
        myMap.changeValue("Dozie", "Odogwu");
        String actual = myMap.mapPrint();
        String expected = "{\"Dozie\": \"Odogwu\", \"Divine\": \"boss\"}";
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifRemovesWork(){
        myMap.add("Dozie", "money");
        myMap.add("Divine", "boss");
        myMap.add("mango", "paw");
        myMap.remove("mango");
        String actual = myMap.mapPrint();
        String expected = "{\"Dozie\": \"money\", \"Divine\": \"boss\"}";
        assertEquals(expected, actual);


    }

}
