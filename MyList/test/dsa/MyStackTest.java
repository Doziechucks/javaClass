package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void test_ifaRemoveAddAndRemoveCanBeDone(){
        myStack.add("man");
        myStack.add("woman");
        myStack.remove();
        myStack.add("girl");
        myStack.remove();
        String actual = myStack.toString();
        String expected = "[\"man\"]";
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifaRemoveRemoveAddAndCanBeDone(){
        myStack.add("man");
        myStack.remove();
        myStack.add("girl");
        myStack.add("hen");
        String actual = myStack.toString();
        String expected = "[\"girl\", \"hen\"]";
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifContainsReturnsCorrectly(){
        myStack.add("girl");
        myStack.add("man");
        myStack.remove();
        assertTrue(myStack.contains("girl"));


    }
    @Test
    public void test_remove(){
        myStack.remove();
    }


}
