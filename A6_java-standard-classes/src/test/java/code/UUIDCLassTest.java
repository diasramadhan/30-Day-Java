package code;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUIDCLassTest {
    @Test
    void testUUIDClass() {
        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
    }
}
