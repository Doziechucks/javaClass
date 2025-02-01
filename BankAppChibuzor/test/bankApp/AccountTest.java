package bankApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class AccountTest {
    Account account;

    @BeforeEach
    public void setAccount(){
        account = new Account("firstName", "lastName", "1212", 1, 0.0);
    }

    @Test
    public void test_ifAccountNumberIsAdded(){
        int actual = account.getAccountNumber();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test_returnBalance(){
        double actual = account.getBalance(1,"1212");
        double expected = 0.0;
        assertEquals(expected, actual,0.0);
        }

    @Test
    public void test_ifBalanceCanAdd(){
        account.deposit(1, 410.5);
        double actual = account.getBalance(1,"1212");
        double expected = 410.5;
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test_ifInvalidInputIsRaised(){
        account.passwordCheck("1212");
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(-300, 410.5));

    }

    @Test
    public void test_ifAccountWithdrwas() {
        account.deposit(1, 410.5);
        account.withdraw(1,10.5, "1212");
        double actual = account.getBalance(1,"1212");
        double expected = 400;
        assertEquals(expected, actual, 0.0);
    }
    @Test
    public void test_ifInvalidInputIsRaisedForWithdrawn(){
        account.deposit(1, 410.5);
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(1,-300, "1212"));
    }

    @Test
    public void test_ifInvaidDetailsIsRaised(){
        account.deposit(1, 410.5);
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(1,300, "121"));

    }

    @Test
    public void testIfPinCanBeChanged(){
        assertTrue(account.channgePin(1,"1212", "1414"));

    }
    @Test
    public void test_errorIsThrownIfPasswordIncorrect(){
        assertThrows(IllegalArgumentException.class, ()-> account.channgePin(1, "1234", "1414"));
    }
}
