package code;

import org.junit.jupiter.api.Test;

public class SuperKeywordTest {
    @Test
    void testSuperShape() {
        Shape shape = new Shape();
        System.out.println(shape.getCorner());
    }

    @Test
    void testSuperRectangle() {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getCornerFromParent());
        System.out.println(rectangle.getCorner());
    }
}
