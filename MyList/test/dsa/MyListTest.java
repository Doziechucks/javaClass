package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyListTest {
    private MyList myList;

    @BeforeEach
    public void setMyList() {
        myList = new MyList();
    }
    @Test
    public void test_ifListEmpty(){
        assertTrue(0== myList.size());

    }

    @Test
    public void test_sizeWhenElementIsAdded(){
        myList.add("G-String");
        assertTrue(1 == myList.size());
    }

    @Test
    public void test_toSeeElementAdded() {
        myList.add("A-String");
        myList.add("B-String");
        String actual = myList.toString();
        String expected = "[\"A-String\", \"B-String\"]";
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifcontainswork(){
        myList.add("mango");
        myList.add("Orange");
        assertTrue(myList.contains("mango"));
    }

    @Test
    public void test_ifIndexReturnWorking(){
        myList.add("mango");
        myList.add("Orange");
        myList.add("Apple");
        assertTrue(1 == myList.index("Orange"));
    }

    @Test
    public void test_toRemoveElement(){
        myList.add("mango");
        myList.add("Orange");
        myList.add("Apple");
        myList.add("Banana");
        myList.remove("Orange");
        assertEquals("[\"mango\", \"Apple\", \"Banana\"]", myList.toString());
    }

    @Test
    public void test_toRemoveElementMoreThanOneElement() {
        myList.add("mango");
        myList.add("Orange");
        myList.add("Apple");
        myList.add("Banana");
        myList.remove("Orange");
        myList.remove("Apple");
        assertEquals(2,myList.size());
        assertEquals("[\"mango\", \"Banana\"]", myList.toString());

    }

}

