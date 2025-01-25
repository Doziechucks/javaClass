package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MysetTest {
    private Myset mySet;

    @BeforeEach
    public void setUp() {
        mySet = new Myset();
    }
    @Test
    public void test_ifMySsetEmpty(){
        assertTrue(0 == mySet.size());
    }

    @Test
    public void test_ifTheSetAdds(){
        mySet.add("man");
        int expected = 1;
        int actual = mySet.size();
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifelementIsAdded(){
        mySet.add("man");
        mySet.add("woman");
        String expected = "{\"man\", \"woman\"}";
        String actual = mySet.toString();
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifRepeatedItemsWillBeAdded(){
        mySet.add("man");
        mySet.add("man");
        mySet.add("woman");
        String expected = "{\"man\", \"woman\"}";
        String actual = mySet.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void test_ifRemovesItem(){
        mySet.add("mango");
        mySet.add("Orange");
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.remove("Orange");
        assertEquals("{\"mango\", \"Apple\", \"Banana\"}", mySet.toString());


    }
}
