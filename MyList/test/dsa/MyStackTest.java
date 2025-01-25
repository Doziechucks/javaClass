package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {
    private MyStack myStack;

    @BeforeEach
    public void setUp() {
        myStack = new MyStack();
    }
    @Test
    public void test_ifStackIsEmpty() {
        int actual = myStack.size();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifStackAddsItem(){
        myStack.add("man");
        int actual = myStack.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifStackPrintWorks(){
        myStack.add("man");
        myStack.add("woman");
        myStack.add("girl");
        String actual = myStack.toString();
        String expected = "[\"man\", \"woman\", \"girl\']";

    }

    @Test
    public void test_ifElementIsRemovedFromStack(){
        myStack.add("man");
        myStack.add("woman");
        myStack.add("girl");
        myStack.remove();
        String actual = myStack.toString();
        String expected = "[\"man\", \"woman\"]";
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifCanClearTheStack() {
        myStack.add("man");
        myStack.add("woman");
        myStack.add("girl");
        myStack.remove();
        myStack.remove();
        myStack.remove();
        String actual = myStack.toString();
        String expected = "[]";
        assertEquals(expected, actual);
    }

}
