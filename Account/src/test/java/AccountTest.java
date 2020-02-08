import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void getUsername() {
        //given

        //when
        Account account = new Account("Pirate", "Jack", "Sparrow");

        //then
        assertEquals(account.getUsername(), "Pirate");
    }
}