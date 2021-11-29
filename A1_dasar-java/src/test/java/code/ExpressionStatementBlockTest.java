package code;

import org.junit.jupiter.api.Test;

public class ExpressionStatementBlockTest {
    @Test
    void testBlock() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");

        {
            System.out.println("Hello World 4");
            System.out.println("Hello World 5");
            System.out.println("Hello World 6");
        }

    }
}
