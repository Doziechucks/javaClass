package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;



public class BankTest {
    Bank bank;
    @BeforeEach
    public void setBank(){
        bank = new Bank();
    }

    @Test
    public void test_ifMyAccountNumberIsAdded(){
        bank.addAccount(1, "6767", "Dozie", "Money");
        int actual = bank.getAccountNumber(bank.getIndex(1));
        int expected = 1;
        assertEquals(actual, expected);

    }
    @Test
    public void test_ifInvalidDetailsRaised(){
        bank.addAccount(1, "6767", "Dozie", "Money");
        assertThrows(IllegalArgumentException.class, ()-> bank.getAccountNumber(bank.getIndex(0)));
    }

    @Test
    public void test_ifTransferCanBeDone(){
        bank.addAccount(1, "6767", "Dozie", "Money");
        System.out.println((bank.balances).toString());
        bank.deposit(1, 500);
        bank.transfer(1, "6767", 400, 2);
        double actual = bank.getBalance(1, "6767");
        bank.getBalance(2, "6762");
        System.out.println((bank.balances).toString());
        double expected = 100;
        assertEquals(expected, actual, 0.0);

    }
}
