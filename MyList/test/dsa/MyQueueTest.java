package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    public void setUp() {
        myQueue = new MyQueue();
    }

    @Test
    public void test_ifMyQueueIsEmpty() {
        int actual = myQueue.size();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifQueueAdds(){
        myQueue.add("girl");
        myQueue.add("man");
        int actual = myQueue.size();
        int expected = 2;
        assertEquals(expected, actual);

    }

    @Test
    public void test_toReturnSet(){
        myQueue.add("man");
        myQueue.add("ene");
        myQueue.add("girl");
        String expected = "(\"man\", \"ene\", \"girl\")";
        String actual = myQueue.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void test_ifQueueRemovesItem(){
        myQueue.add("man");
        myQueue.add("ene");
        myQueue.add("girl");
        myQueue.remove();
        String expected = "(\"ene\", \"girl\")";
        String actual = myQueue.toString();
        assertEquals(expected, actual);


    }

    @Test
    public void test_forRemovalOfMultipleItems(){
        myQueue.add("man");
        myQueue.add("ene");
        myQueue.add("girl");
        myQueue.remove();
        myQueue.remove();
        String expected = "(\"girl\")";
        String actual = myQueue.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void test_forRemovalAdditionThenRemoval(){
        myQueue.add("man");
        myQueue.add("ene");
        myQueue.add("girl");
        myQueue.remove();
        myQueue.add("woman");
        myQueue.remove();
        String expected = "(\"girl\", \"woman\")";
        String actual = myQueue.toString();
        assertEquals(expected, actual);

    }

    @Test
    public void test_addAndRemovingSingleItems(){
        myQueue.add("girl");
        myQueue.remove();
        String expected = "()";
        String actual = myQueue.toString();
        assertEquals(expected, actual);
    }
}
