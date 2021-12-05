package code;

import org.junit.jupiter.api.Test;

public class EncapsulationTest{
    @Test
    void testCategory() {
        var category = new Category();
        category.setId(null);
        category.setExpensive(true);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        category.setId("ID 0171");
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        category.setId(null);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
