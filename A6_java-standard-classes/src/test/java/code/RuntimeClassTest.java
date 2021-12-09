package code;

import org.junit.jupiter.api.Test;

public class RuntimeClassTest {
    @Test
    void testClassRuntime() {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
    }
}
