package code;

import org.junit.jupiter.api.Test;

public class ToStringTest {
    @Test
    void testProduct() {
        Product product = new Product("Asus A421DA",10000000);
        System.out.println(product);
    }
}
