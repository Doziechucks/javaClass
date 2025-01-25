package dsa;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    public void setUp() {
        myQueue = new MyQueue();
    }

    public void test_ifMyQueueIsEmpty() {
        int actual = myQueue.size();
        int expected = 0;
        assertEquals(expected, actual);

    }

}
