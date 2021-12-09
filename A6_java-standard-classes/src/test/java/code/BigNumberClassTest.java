package code;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberClassTest {
    @Test
    void testBigInteger() {
        BigInteger a = new BigInteger("100000000000000000000000000000");
        BigInteger b = new BigInteger("100000000000000000000000000000");

        BigInteger divide = a.divide(b);
        System.out.println(divide);
    }

    @Test
    void testBigDecial() {
        BigDecimal a = new BigDecimal("1.23456789101112");
        BigDecimal b = new BigDecimal("1");
        BigDecimal divide = a.divide(b);
        System.out.println(divide);
    }
}
