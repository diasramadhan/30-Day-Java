package code;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomClassTest {
    @Test
    void testRandom() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }
    }
}
