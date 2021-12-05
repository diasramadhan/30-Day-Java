package code;

import org.junit.jupiter.api.Test;

public class EqualsTest {
    @Test
    void testEqual() {
        String first = "Dias";
        first = first + " Ramadhan";

        System.out.println(first);

        String second = "Dias Ramadhan";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Dias Ramadhan";
        System.out.println(second == third);
        System.out.println(second.equals(third));

    }

    @Test
    void testProduct() {
        Product product = new Product("Asus",10_000_000);
        Product product2 = new Product("Asus",10_000_000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
