package code;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class SystemClassTest {
    @Test
    void testMethodSystem() {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        Map<String, String> getenv = System.getenv();
        getenv.forEach((s, s2) -> {
            System.out.println(s + " : " + s2);
        });

        System.out.println(System.getenv("HOME"));

        System.gc();

    }
}
