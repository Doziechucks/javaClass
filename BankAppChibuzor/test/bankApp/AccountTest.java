package bankApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class AccountTest {
    Account account;

    @BeforeEach
    public void setAccount(){
        account = new Account("firstName", "lastName", "1212", 1);
    }

    @Test
    public void test_toAccountNumber(){
        int actual = account.getAccountNumber();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test_returnBalance(){
        double actual = account.getBalance("1212");
        double expected = 0.0;
        assertEquals(expected, actual,0.0);
        }

    @Test
    public void test_ifBalanceCanAdd(){
        account.deposit(410.5);
        double actual = account.getBalance("1212");
        double expected = 410.5;
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test_ifInvalidInputIsRaised(){
        account.passwordCheck("1212");
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(-300));

    }

    @Test
    public void test_ifAccountWithdrwas() {
        account.deposit(410.5);
        account.withdraw(10.5, "1212");
        double actual = account.getBalance("1212");
        double expected = 400;
        assertEquals(expected, actual, 0.0);
    }
    @Test
    public void test_ifInvalidInputIsRaisedForWithdrawn(){
        account.deposit(410.5);
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(-300, "1212"));
    }

    @Test
    public void test_ifInvaidDetailsIsRaised(){
        account.deposit(410.5);
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(300, "121"));
    }
}
