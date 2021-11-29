package code;

import org.junit.jupiter.api.Test;

public class TipeDataBukanPrimitifTest {
    @Test
    void testNonPrimitif() {
        Integer integer = 100;
        Long aLong = 1000L;

        Byte aByte = null;
        System.out.println(aByte);

        aByte = 100;

        System.out.println(aByte);

        int i = 100;

        Integer integer1 = i;

        String s = "10";

        String s1 = String.valueOf(integer1);

        short i1 = integer1.shortValue();
    }
}
