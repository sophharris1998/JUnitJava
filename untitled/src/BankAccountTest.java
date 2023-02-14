import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class BankAccountTest {
    private BankAccount account;
    @BeforeEach
        //Arrange
    void setUp() {
        account = new BankAccount (1000.00, "Sophie Account");

    }

    @Test
    void deposit_PositiveAmount_IncreasedBalance() {
        //Act
        account.deposit(200);
        //Assert
        assertEquals(1200.00, account.getBalance());
    }

    @Test
    void withdraw_PositiveAmount_DecreasedBalance() {
        account.withdraw(200);
        assertEquals(800.00, account.getBalance() );
    }

    @Test
    void deposit_NegativeAmount_NoChange() {
        account.deposit(-100.00);
        assertEquals(1000.00, account.getBalance());
    }

    @Test
    void withdraw_NegativeAmount_NoChange() {
        account.withdraw(-100.00);
        assertEquals(1000.00, account.getBalance());
    }

    @Test
    void
    }