package code;

import org.junit.jupiter.api.Test;

public class MathClassTest {
    @Test
    void testMath() {
        int min = Math.min(1000, 200);
        System.out.println(min);

        int max = Math.max(1000, 200);
        System.out.println(max);

        System.out.println(Math.PI);
    }
}
