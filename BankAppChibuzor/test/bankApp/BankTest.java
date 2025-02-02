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
    public void test_ifMyAccountOneCanDeposit(){
        bank.createAccount("1212", "Dozie", "Money");
        bank.deposit(1, 300);
        double actual = bank.getBalance(1, "1212");
        double expected = 300;
        assertEquals(expected, actual, 0.0);

    }

    @Test
    public void test_ifMyAccountCanAddTwoWithdrawAndDeposit(){
        bank.createAccount("1212", "Dozie", "Money");
        bank.createAccount("1211", "Divine", "Money");
        bank.deposit(2, 300);
        bank.withdraw("1211", 2, 30);
        double actual = bank.getBalance(2, "1211");
        double expected = 270;
        assertEquals(expected, actual, 0.0);

    }

    @Test
    public void test_MethodThrowsInvalidPasswordforWithdraw(){
        bank.createAccount("1212", "Dozie", "Money");
        bank.createAccount("1211", "Divine", "Money");
        bank.deposit(2, 300);
        assertThrows(IllegalArgumentException.class, ()-> bank.withdraw("1213", 2, 30));
    }

    @Test
    public void test_ifAccountCanTransfer(){
        bank.createAccount("1212", "Dozie", "Money");
        bank.createAccount("1211", "Divine", "Money");
        bank.deposit(1, 5000.5);
        bank.transfer(1, "1212", 300.5, 2);
        double actual = bank.getBalance(2, "1211");
        double expected = 300.5;
        assertEquals(expected, actual, 0.0);


    }

    @Test
    public void test_ifInvalidAmountThrown(){
        bank.createAccount("1212", "Dozie", "Money");
        bank.createAccount("1211", "Divine", "Money");
        bank.deposit(1, 5000.5);
        assertThrows(IllegalArgumentException.class, ()-> bank.transfer(1, "1212", 30000.5, 2));

    }


}
