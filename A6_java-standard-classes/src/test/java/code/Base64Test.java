package code;

import org.junit.jupiter.api.Test;

import java.util.Base64;

public class Base64Test {
    @Test
    void testBase64() {

        String ori = "Dias Nur Ramadhan";

        String encoded = Base64.getEncoder().encodeToString(ori.getBytes());
        System.out.println(encoded);
    }

    @Test
    void toStringSemula() {
        String ori = "Dias Nur Ramadhan";

        String encoded = Base64.getEncoder().encodeToString(ori.getBytes());

        byte[] decode = Base64.getDecoder().decode(encoded);
        String name = new String(decode);
        System.out.println(name);
    }
}
