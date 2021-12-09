package code;

import org.junit.jupiter.api.Test;

public class NumberClassTest {
    @Test
    void testNumberConvert() {
        Integer intValue = 10;
        Long longValue = intValue.longValue();

        String stringValue = "10";
//        Long longString = stringValue.longValue(); //ERROR
        Integer integerValue = Integer.parseInt(stringValue);
        System.out.println(integerValue);
    }
}
