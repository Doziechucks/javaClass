package bankApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class AccountTest {
    Account account;

    @BeforeEach
    public void setAccount(){
        account = new Account();
    }

    @Test
    public void test_ifBalanceIsZero(){
        Double expected = 0.0;
        Double actual = account.getBalance("7654789989", "6767");
        assertEquals(expected, actual);

    }


}
