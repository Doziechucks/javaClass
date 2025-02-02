package bankApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class AccountTest {
    Account account;

    @BeforeEach
    public void setAccount() {
        account = new Account("firstName", "lastName", "1212", 1);
    }

    @Test
    public void test_toReturnBalance(){
        double actual = account.getBalance("1212");
        double expected = 0.0;
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test_ifFirstNameIsReturned(){
        String actual = account.getFirstName();
        String expected = "firstName";
        assertEquals(expected, actual);

    }

    @Test
    public void test_ifMoneyIsdeposited(){
        account.deposit(420.5);
        double actual = account.getBalance("1212");
        double expected = 420.5;
        assertEquals(actual, expected, 0.0);
    }

    @Test
    public void test_ifMoneyIsWithdrawn(){
        account.deposit(420.5);
        account.withdraw("1212",20.5);
        double actual = account.getBalance("1212");
        double expected = 400;
        assertEquals(actual, expected, 0.0);

    }

    @Test
    public void test_ifDepositBelowZeroThrowsException(){
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(-420));
    }

    @Test
    public void test_withdrawThrowsExceptionForWrongPassword(){
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw("1213",20.5));
    }

    @Test
    public void test_ifPinChanges(){
        assertTrue(account.updatePin("1212", "1321"));
    }

    @Test
    public void test_ifErrorIsRaisedWithWrongPassword(){
        assertThrows(IllegalArgumentException.class, ()-> account.updatePin("1211", "1321"));
    }

}