package jeff.roullette;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class betTest {

    @Test
    void testConstructor() {
        Bet testBet = new Bet("Black", 20);
        String expectedString = "Black Bet Amount: 20";
        assertEquals(expectedString, testBet.toString());
    }
}