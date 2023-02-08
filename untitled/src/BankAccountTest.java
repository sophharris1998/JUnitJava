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
    void deposit() {
        //Act
        account.deposit(200);
        //Assert
        assertEquals(1200.00, account.getBalance());
    }

    @Test
    void withdraw() {
        account.withdraw(200);
        assertEquals(800.00, account.getBalance() );
    }
}