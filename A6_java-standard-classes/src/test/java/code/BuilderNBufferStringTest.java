package code;

import org.junit.jupiter.api.Test;

public class BuilderNBufferStringTest {
    @Test
    void testStringBuilder() {
        //tidak thread safe
        StringBuilder builder = new StringBuilder("Dias");
        builder.append(" ");
        builder.append("Nur");
        builder.append(" ");
        builder.append("Ramadhan");
        System.out.println(builder);

        String name = builder.toString();
        System.out.println(name);
    }

    @Test
    void testStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer("Dias");
        stringBuffer.append(" ");
        stringBuffer.append("Nur");
        stringBuffer.append(" ");
        stringBuffer.append("Ramadhan");
        System.out.println(stringBuffer);
    }
}
