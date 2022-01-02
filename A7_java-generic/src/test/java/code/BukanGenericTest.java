package code;

import org.junit.jupiter.api.Test;

public class BukanGenericTest {
    @Test
    void testData() {
        BukanGeneic bukanGeneic = new BukanGeneic(100);
        BukanGeneic bukanGeneic2 = new BukanGeneic("Dias Nur Ramadhan");

        System.out.println(bukanGeneic.getData());

        System.out.println(bukanGeneic2.getData());

    }
}
