package code;

import org.junit.jupiter.api.Test;

public class RecordTest {
    @Test
    void LoginRequestTest() {
        LoginRequest request = new LoginRequest("Dias Nur Ramadhan","password");
        System.out.println(request.toString());
    }
}
