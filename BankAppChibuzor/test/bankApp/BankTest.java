package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BankTest {
    Bank bank;
    @BeforeEach
    public void setBank(){
        bank = new Bank();
    }

    @Test
    public void test_ifMyAccountNumberIsAdded(){
        bank.addAccount("2323232323");
        String actual = bank.getAccountNumber(bank.getIndex());
        String expected = "2323232323";
        assertEquals(actual, expected);

    }
}
