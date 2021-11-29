package code;

import org.junit.jupiter.api.Test;

public class KonversiTest {
    @Test
    void testKonversiNumber() {
        byte thisByte = 10;
        short thisShort = thisByte;
        int thisInt = thisShort;

        int thisInt2 = 1000;
        byte iniByte2 = (byte) thisInt2;
    }
}
